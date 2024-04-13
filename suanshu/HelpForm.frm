VERSION 5.00
Begin VB.Form HelpForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "帮助"
   ClientHeight    =   5415
   ClientLeft      =   45
   ClientTop       =   435
   ClientWidth     =   6915
   Icon            =   "HelpForm.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   5415
   ScaleWidth      =   6915
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command3 
      Caption         =   "帮助说明"
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
      Left            =   1680
      TabIndex        =   3
      Top             =   4680
      Width           =   1335
   End
   Begin VB.CommandButton Command2 
      Caption         =   "更新说明"
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
      Left            =   3240
      TabIndex        =   2
      Top             =   4680
      Width           =   1335
   End
   Begin VB.TextBox Text 
      BackColor       =   &H80000009&
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   4320
      Left            =   120
      Locked          =   -1  'True
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   1
      Top             =   120
      Width           =   6615
   End
   Begin VB.CommandButton Command1 
      Caption         =   "隐藏"
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
      Left            =   120
      TabIndex        =   0
      Top             =   4680
      Width           =   1335
   End
   Begin VB.Image Image1 
      Height          =   615
      Left            =   5040
      Picture         =   "HelpForm.frx":0ECA
      Stretch         =   -1  'True
      Top             =   4560
      Width           =   1695
   End
End
Attribute VB_Name = "HelpForm"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit

Private Sub Command1_Click()
Me.Hide
End Sub

Private Sub Command2_Click()
Text.Text = "V1.1.0更新：" & vbCrLf & _
"1.减法答案没有负数，除法答案都是整数。" & vbCrLf & _
"2.结果窗口中，最后评语放大加粗。" & vbCrLf & _
"3.修改了在“无限模式”中按暂停没有效果的BUG。" & vbCrLf & _
"4.帮助窗口全面改版。" & vbCrLf & _
"5.增加界面透明度设置。" & vbCrLf & _
"6.修改了减法单项练习的BUG。" & vbCrLf & vbCrLf & _
"V1.1.2更新： " & vbCrLf & _
"1.程序图标改版，代码优化" & vbCrLf & vbCrLf & _
"V1.1.3更新： " & vbCrLf & _
"1.将会自动植入方正卡通简体" & vbCrLf & vbCrLf & _
"V1.1.4更新： " & vbCrLf & _
"1.界面细微调整" & vbCrLf & _
"2.优化部分代码" & vbCrLf & _
"V1.2.0更新： " & vbCrLf & _
"1.增加草稿窗体，遇到比较复杂的题目可列竖式" & vbCrLf & vbCrLf & _
"1.修复一些小BUG"
End Sub

Private Sub Command3_Click()
Call HelpText(Text)
End Sub

Private Sub Form_Load()
Call FormCenter(Me)
Call HelpText(Text)
End Sub

Private Sub Text_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = vbKeyF1 Then HelpForm.Hide
End Sub

