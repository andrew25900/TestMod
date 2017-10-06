@echo off
echo Adding Changed Files...
git add .
timeout /t 1 /nobreak > NUL
echo Please Enter A Commit Name.
set /p commitName=Commit Name:
git commit -m " + %commitName% + "
timeout /t 1 /nobreak > NUL
echo Checking Remote Origin...
git remote add origin https://github.com/andrew25900/TestMod.git
timeout /t 1 /nobreak > NUL
echo Pushing Changes To Github...
git push origin master
timeout /t 1 /nobreak > NUL
echo Finished. You can access at https://github.com/andrew25900/TestMod.git
pause