VERSION 5.00
Begin VB.Form GameForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "游戏"
   ClientHeight    =   4200
   ClientLeft      =   45
   ClientTop       =   435
   ClientWidth     =   7500
   ControlBox      =   0   'False
   Icon            =   "GameForm.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   4200
   ScaleWidth      =   7500
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton CmdDraw 
      Caption         =   "打开草稿"
      Enabled         =   0   'False
      Height          =   855
      Left            =   6240
      TabIndex        =   7
      Top             =   2520
      Width           =   615
   End
   Begin VB.Timer TimerEach 
      Enabled         =   0   'False
      Left            =   240
      Top             =   2400
   End
   Begin VB.Timer TimerAll 
      Enabled         =   0   'False
      Interval        =   1000
      Left            =   240
      Top             =   2880
   End
   Begin VB.CommandButton CmdStop 
      BackColor       =   &H00E0E0E0&
      Caption         =   "返回"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   5280
      TabIndex        =   3
      Top             =   3600
      Width           =   1815
   End
   Begin VB.CommandButton CmdStart 
      BackColor       =   &H00E0E0E0&
      Caption         =   "开始"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   360
      TabIndex        =   1
      Top             =   3600
      Width           =   1815
   End
   Begin VB.TextBox Text 
      BackColor       =   &H00FFFFFF&
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "黑体"
         Size            =   42
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   900
      Left            =   4320
      MaxLength       =   4
      TabIndex        =   0
      Top             =   2520
      Width           =   1815
   End
   Begin VB.CommandButton CmdPause 
      BackColor       =   &H00E0E0E0&
      Caption         =   "暂停"
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   2880
      TabIndex        =   2
      Top             =   3600
      Width           =   1815
   End
   Begin VB.Image ImageCry 
      Height          =   1620
      Left            =   5280
      Picture         =   "GameForm.frx":0ECA
      Top             =   120
      Width           =   1755
   End
   Begin VB.Image ImageNormal 
      Height          =   1590
      Left            =   2880
      Picture         =   "GameForm.frx":5863
      Top             =   120
      Width           =   1740
   End
   Begin VB.Image ImageSmile 
      Height          =   1590
      Left            =   480
      Picture         =   "GameForm.frx":9DCA
      Top             =   120
      Width           =   1725
   End
   Begin VB.Label LabelTime 
      AutoSize        =   -1  'True
      BorderStyle     =   1  'Fixed Single
      Caption         =   "时间"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   480
      Left            =   1080
      TabIndex        =   6
      Top             =   1920
      Width           =   810
   End
   Begin VB.Label LabelAnswer 
      AutoSize        =   -1  'True
      BorderStyle     =   1  'Fixed Single
      Caption         =   "对错"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   480
      Left            =   4320
      TabIndex        =   5
      Top             =   1920
      Width           =   810
   End
   Begin VB.Image ImageRest 
      Height          =   1335
      Left            =   960
      Picture         =   "GameForm.frx":E697
      Stretch         =   -1  'True
      Top             =   2280
      Visible         =   0   'False
      Width           =   3255
   End
   Begin VB.Label Label 
      Alignment       =   1  'Right Justify
      AutoSize        =   -1  'True
      BorderStyle     =   1  'Fixed Single
      BeginProperty Font 
         Name            =   "黑体"
         Size            =   42
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   900
      Left            =   960
      TabIndex        =   4
      Top             =   2520
      Width           =   3255
   End
End
Attribute VB_Name = "GameForm"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Public TimeSec, TimeEach, MsgEnd As Integer
Public a, b, c As Integer
Dim Key As Single
Public RightNum, WrongNum, AllNum As Integer

Private Sub CmdDraw_Click()
DrawForm.Show
End Sub

Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = vbKeyF1 Then HelpForm.Show
End Sub

Private Sub Form_Load()
Call FormAlpha(Me, StartForm.HScroll1.Value)
Call FormCenter(Me)

RightNum = 0: WrongNum = 0: AllNum = 0
End Sub

Private Sub CmdPause_Click()
Call FaceNormal

CmdPause.Caption = IIf(CmdPause.Caption = "暂停", "继续", "暂停")
TimerAll.Enabled = Not TimerAll.Enabled
TimerEach.Enabled = Not TimerEach.Enabled
Text.Enabled = Not Text.Enabled
ImageRest.Visible = Not ImageRest.Visible
End Sub

Private Sub CmdStart_Click()
On Error GoTo ErrLine
Call FaceNormal

If StartForm.Model = "计时模式" Then
    TimeSec = Int(InputBox("请输入总时间（秒）", "计时模式设置"))
    If TimeSec <= 0 Then
        MsgBox "请输入正确的时间", vbOKOnly + vbCritical, "错误"
        Exit Sub
    End If
ElseIf StartForm.Model = "无限模式" Then
    TimeEach = Int(InputBox("请输入每题时间间隔（秒）", "无限模式设置"))
    If TimeEach <= 0 Then
ErrLine: MsgBox "请输入正确的时间", vbOKOnly + vbCritical, "错误"
        Exit Sub
    End If
    TimerEach.Interval = TimeEach * 1000
    TimerEach.Enabled = True
End If

TimerAll.Enabled = True

Text.Enabled = True
Text.SetFocus

CmdStart.Enabled = False
CmdPause.Enabled = True
CmdDraw.Enabled = True
CmdStop.Caption = "停止"

Call Game
End Sub

Private Sub CmdStop_Click()
Call FaceNormal
If CmdStop.Caption = "停止" Then
    If StartForm.Model = "计时模式" Then
        MsgEnd = MsgBox("确定停止吗？还没有结束", vbOKCancel + vbInformation, "停止")
        If MsgEnd = 1 Then ResultForm.Show: Unload Me: Unload DrawForm
    ElseIf StartForm.Model = "无限模式" Then
        MsgEnd = MsgBox("确定停止吗？", vbOKCancel + vbInformation, "停止")
        If MsgEnd = 1 Then ResultForm.Show: Unload Me: Unload DrawForm
    End If
    CmdDraw.Enabled = False
Else
    MsgEnd = MsgBox("确定返回吗？", vbOKCancel + vbInformation, "返回")
    If MsgEnd = 1 Then
        Unload Me: Unload DrawForm
        Load StartForm: StartForm.Show
    End If
End If
End Sub

Private Sub Text_KeyPress(KeyAscii As Integer)
If StartForm.Model = "计时模式" And KeyAscii = vbKeyReturn Then
    Call IsRight
    Call Game
    AllNum = AllNum + 1
    Unload DrawForm
End If
End Sub

Private Sub TimerAll_Timer()
If StartForm.Model = "计时模式" Then
    TimeSec = Val(TimeSec) - 1
    LabelTime.Caption = "剩余" & TimeSec & "秒"
    If TimeSec = 0 Then
        MsgBox "时间到！", vbOKOnly + vbInformation, "提示"
        ResultForm.Show: Unload Me: Unload DrawForm
    End If
ElseIf StartForm.Model = "无限模式" Then
    TimeSec = Val(TimeSec) + 1
    LabelTime.Caption = "已用" & TimeSec & "秒"
End If
End Sub

Private Sub TimerEach_Timer()
Call IsRight
Call Game
Unload DrawForm
AllNum = AllNum + 1
End Sub

Sub Game()
Select Case StartForm.Project
Case "加法单项练习"
    c = 1
Case "减法单项练习"
    c = 2
Case "乘法单项练习"
    c = 3
Case "除法单项练习"
    c = 4
Case "加减乘除混合练习"
    c = Choose(Int(Rnd() * 4 + 1), 1, 2, 3, 4)
End Select

line:
Randomize
a = Int(Rnd() * AccecptForm.Level)
b = Int(Rnd() * AccecptForm.Level)

Select Case c
Case 1
    Key = a + b
    Label.Caption = a & "＋" & b & "="
Case 2
    Key = a - b
    If Key < 0 Then GoTo line
    Label.Caption = a & "－" & b & "="
Case 3
    Key = a * b
    Label.Caption = a & "×" & b & "="
Case 4
    If b = 0 Then GoTo line
    Key = a / b
    If Key < 1 Or Key <> Int(Key) Then GoTo line
    Label.Caption = a & "÷" & b & "="
End Select
End Sub

Sub IsRight()
ImageNormal.Visible = False
If Val(Text.Text) = Key Then
    LabelAnswer.Caption = "答对了"
    ImageSmile.Visible = True
    ImageCry.Visible = False
    RightNum = RightNum + 1
Else
    LabelAnswer.Caption = "答错了"
    ImageSmile.Visible = False
    ImageCry.Visible = True
    WrongNum = WrongNum + 1
End If
Text.Text = ""
End Sub

Sub FaceNormal()
ImageSmile.Visible = False
ImageCry.Visible = False
ImageNormal.Visible = True
End Sub
