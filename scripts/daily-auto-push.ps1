$ErrorActionPreference = "Stop"
$repoPath = Split-Path -Parent $PSScriptRoot

Set-Location -LiteralPath $repoPath

git add --all
if ($LASTEXITCODE -ne 0) {
    throw "git add failed."
}

git diff --cached --quiet
$hasStagedChanges = $LASTEXITCODE -ne 0

if ($hasStagedChanges) {
    $commitDate = Get-Date -Format "yyyy-MM-dd"
    git commit -m "Automated daily backup $commitDate"
    if ($LASTEXITCODE -ne 0) {
        throw "git commit failed."
    }
}

git push
if ($LASTEXITCODE -ne 0) {
    throw "git push failed. Check the remote and authentication."
}