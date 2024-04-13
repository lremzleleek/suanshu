Attribute VB_Name = "Module1"
'窗体透明
Public Declare Function SetLayeredWindowAttributes Lib "user32" (ByVal hwnd As Long, ByVal crKey As Long, ByVal bAlpha As Byte, ByVal dwFlags As Long) As Long
Public Declare Function SetWindowLong Lib "user32" Alias "SetWindowLongA" (ByVal hwnd As Long, ByVal nIndex As Long, ByVal dwNewLong As Long) As Long
Public Declare Function GetWindowLong Lib "user32" Alias "GetWindowLongA" (ByVal hwnd As Long, ByVal nIndex As Long) As Long
Public Const WS_EX_LAYERED = &H80000
Public Const GWL_EXSTYLE = (-20)
Public Const LWA_ALPHA = 2
Public Const LWA_COLORKEY = 1

Sub FormAlpha(FormName As Form, Alpha As Integer)
SetWindowLong FormName.hwnd, GWL_EXSTYLE, WS_EX_LAYERED Or GetWindowLong(FormName.hwnd, GWL_EXSTYLE)
SetLayeredWindowAttributes FormName.hwnd, vbBlue, Alpha, LWA_ALPHA
End Sub

Sub FormCenter(FormName As Form)
FormName.Left = Screen.Width / 2 - FormName.Width / 2
FormName.Top = Screen.Height / 2 - FormName.Height / 2
End Sub

Sub HelpText(TextName As TextBox)
TextName.text = Space(4) & "1.开始画面中，项目选择模块将选择你的算术类型，分为四种单项练习与一种混合练习，题目将随机产生。" & vbCrLf & _
Space(4) & "2.开始画面中，模式难度选择模块将选择你的“算术难度”与“算术模式”" & vbCrLf & _
Space(4) & "3.“算术模式”中的“计时模式”将在练习开始之前要求输入练习的总时间，你将在设定的时间之内尽可能多得完成算术题，输入答案之后，按回车键表示确定即可进入下一题。" & vbCrLf & _
Space(4) & "4.“无限模式”将在练习开始之前要求输入每题之间的时间间隔。练习开始之后，无需按回车键，程序会自动根据设置好的时间间隔，每隔一段时间自动判断对错并进入下一题。" & vbCrLf & _
Space(4) & "5.完成设置，确认设置便可进入练习。" & vbCrLf & _
Space(4) & "6.游戏界面中，点击“开始”将提示输入时间，完成之后便可练习。点击“暂停”，计时停止，同时题目隐藏。点击“返回”，可返回开始画面重新选择。点击“退出”，可强制 停止练习。" & vbCrLf & _
Space(4) & "7.结果界面中将显示答题情况。" & vbCrLf & _
Space(4) & "8.按F1键随时弹出帮助界面。"
End Sub


