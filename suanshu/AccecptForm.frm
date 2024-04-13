VERSION 5.00
Begin VB.Form AccecptForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "确认"
   ClientHeight    =   2250
   ClientLeft      =   45
   ClientTop       =   435
   ClientWidth     =   4335
   ControlBox      =   0   'False
   Icon            =   "AccecptForm.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   2250
   ScaleWidth      =   4335
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Cmd2 
      BackColor       =   &H00E0E0E0&
      Caption         =   "重选"
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
      Left            =   2400
      TabIndex        =   2
      Top             =   1560
      Width           =   1575
   End
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
      Left            =   360
      TabIndex        =   1
      Top             =   1560
      Width           =   1575
   End
   Begin VB.Label Label 
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1335
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   4095
   End
End
Attribute VB_Name = "AccecptForm"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Public Level As Integer
Dim i As Integer

Private Sub Cmd1_Click()
Load GameForm
GameForm.Show

Unload AccecptForm
End Sub

Private Sub Cmd2_Click()
StartForm.Show
Unload AccecptForm
End Sub

Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = vbKeyF1 Then HelpForm.Show
End Sub

Private Sub Form_Load()
Call FormAlpha(Me, StartForm.HScroll1.Value)
Call FormCenter(Me)

Label.Caption = "你选择的难度项目是：" & vbCrLf & "“" & StartForm.ComboLevel.Text & "”的“" & StartForm.Project & "”" & vbCrLf & vbCrLf & _
"你选择的模式是：" & StartForm.Model
For i = 0 To 5
    Level = Choose(StartForm.ComboLevel.ListIndex + 1, 10, 20, 30, 40, 50, 100)
Next
End Sub
