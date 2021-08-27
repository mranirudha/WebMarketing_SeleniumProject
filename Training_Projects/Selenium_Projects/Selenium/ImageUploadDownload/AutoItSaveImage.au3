
;~ Script to download image to a path provided
;~ type the below lines is AutoIT ide
;~ save as AutiITSAveImage.au3 in project resources folder
;~ and compile --> To compile use command in autoit ide  --> Ctrl+f7 /Go to tools-->Compile
;~ and provide name as  "AutoItSaveImage.exe"

AutoItSetOption("sendKeyDelay",400)
Send("v")
sleep(2000)
Send("C:\Users\training\Desktop\Selenium_Projects\Selenium\ImageUploadDownload\Logo-Selenium.png")
sleep(1000)
Send("{Enter}")