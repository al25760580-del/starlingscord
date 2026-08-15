import json, time, urllib.request, sys

REPO = "al25760580-del/starlingscord"
SHA = "HEAD"
API = f"https://api.github.com/repos/{REPO}"


def get(url):
    req = urllib.request.Request(
        url, headers={"User-Agent": "curl/8", "Accept": "application/vnd.github+json"}
    )
    with urllib.request.urlopen(req, timeout=30) as r:
        return json.load(r)


run = None
deadline = time.time() + 1500
while time.time() < deadline:
    try:
        data = get(f"{API}/actions/runs?per_page=5")
    except Exception as e:
        print("poll error:", e)
        time.sleep(20)
        continue
    for r in data.get("workflow_runs", []):
        if r.get("head_sha", "") == SHA:
            run = r
            break
    if run is None:
        print("run not found yet, waiting...")
        time.sleep(15)
        continue
    status = run.get("status")
    print(f"[poll] run {run['id']} status={status} conclusion={run.get('conclusion')}", flush=True)
    if status == "completed":
        break
    time.sleep(30)

if run is None:
    print("NO RUN FOUND")
    sys.exit(2)

conclusion = run.get("conclusion")
print("CONCLUSION:", conclusion, flush=True)

try:
    jobs = get(f"{API}/actions/runs/{run['id']}/jobs?per_page=20")
    for j in jobs.get("jobs", []):
        print(f"JOB {j['name']} conclusion={j.get('conclusion')}", flush=True)
except Exception as e:
    print("jobs fetch error:", e)

if conclusion != "success":
    try:
        comments = get(f"{API}/commits/{SHA}/comments")
        print("==== COMMIT COMMENTS (Kotlin errors if any) ====", flush=True)
        for c in comments:
            print(f"---- {c.get('user', {}).get('login')} ----", flush=True)
            print(c.get("body", ""), flush=True)
    except Exception as e:
        print("comment fetch error:", e)
