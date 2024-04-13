VERSION 5.00
Begin VB.Form ResultForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "结果"
   ClientHeight    =   3630
   ClientLeft      =   45
   ClientTop       =   435
   ClientWidth     =   4725
   ControlBox      =   0   'False
   Icon            =   "FormResult.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   3630
   ScaleWidth      =   4725
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Cmd1 
      Caption         =   "确定"
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
      Left            =   1080
      Style           =   1  'Graphical
      TabIndex        =   1
      Top             =   3000
      Width           =   2535
   End
   Begin VB.Label LabelSaying 
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   495
      Left            =   120
      TabIndex        =   2
      Top             =   2400
      Width           =   4455
   End
   Begin VB.Label Label 
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   14.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2175
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   4455
   End
End
Attribute VB_Name = "ResultForm"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim Mark As Long

Private Sub Cmd1_Click()
Unload Me
Load GameForm
GameForm.Show
End Sub

Private Sub Form_Load()
On Error GoTo ErrLine
Call FormAlpha(Me, StartForm.HScroll1.Value)
Call FormCenter(Me)

Mark = Int(GameForm.RightNum / GameForm.AllNum * 100)

If StartForm.Model = "计时模式" Then
    If GameForm.TimeSec = 0 Then
        Label.Caption = "恭喜在规定时间内完成练习"
    ElseIf GameForm.TimeSec <> 0 Then
        Label.Caption = "你还没有完成所有练习"
    End If
ElseIf StartForm.Model = "无限模式" Then
    Label.Caption = GameForm.LabelTime.Caption
End If
    
Label.Caption = Label.Caption & vbCrLf & vbCrLf & "一共" & GameForm.AllNum & "题" & vbCrLf & _
"答对：" & GameForm.RightNum & "题" & vbCrLf & _
"答错：" & GameForm.WrongNum & "题" & vbCrLf & _
"答对率：" & Mark & "%" & vbCrLf & vbCrLf

If Mark >= 80 Then
    LabelSaying.Caption = "真棒！！！"
ElseIf Mark < 80 And Mark >= 60 Then
    LabelSaying.Caption = "还行！"
ElseIf Mark < 60 Then
    LabelSaying.Caption = "要加油了，不太理想哦。"
End If

Exit Sub

ErrLine:
Unload GameForm
Label.Caption = "你还没有做题呢！"
End Sub

Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = vbKeyF1 Then HelpForm.Show
End Sub

