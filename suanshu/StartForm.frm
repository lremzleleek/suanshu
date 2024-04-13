VERSION 5.00
Begin VB.Form StartForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "算算术"
   ClientHeight    =   5415
   ClientLeft      =   45
   ClientTop       =   435
   ClientWidth     =   6915
   Icon            =   "StartForm.frx":0000
   KeyPreview      =   -1  'True
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   5415
   ScaleWidth      =   6915
   StartUpPosition =   3  '窗口缺省
   Begin VB.HScrollBar HScroll1 
      Height          =   255
      LargeChange     =   50
      Left            =   600
      Max             =   255
      Min             =   10
      SmallChange     =   10
      TabIndex        =   13
      Top             =   4320
      Value           =   255
      Width           =   2655
   End
   Begin VB.CommandButton Cmd3 
      BackColor       =   &H00E0E0E0&
      Caption         =   "帮助"
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
      Left            =   2760
      TabIndex        =   3
      Top             =   4800
      Width           =   1455
   End
   Begin VB.CommandButton Cmd2 
      BackColor       =   &H00E0E0E0&
      Caption         =   "退出"
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
      Left            =   4920
      TabIndex        =   4
      Top             =   4800
      Width           =   1455
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
      Left            =   600
      TabIndex        =   2
      Top             =   4800
      Width           =   1455
   End
   Begin VB.Frame Frame2 
      Caption         =   "模式难度选择"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1815
      Left            =   600
      TabIndex        =   12
      Top             =   1800
      Width           =   2655
      Begin VB.ComboBox ComboLevel 
         BeginProperty Font 
            Name            =   "方正卡通简体"
            Size            =   12
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   405
         ItemData        =   "StartForm.frx":0ECA
         Left            =   240
         List            =   "StartForm.frx":0ECC
         Style           =   2  'Dropdown List
         TabIndex        =   1
         Top             =   360
         Width           =   1575
      End
      Begin VB.OptionButton OptModel 
         Caption         =   "无限模式"
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
         Index           =   1
         Left            =   240
         TabIndex        =   6
         Top             =   1200
         Width           =   1575
      End
      Begin VB.OptionButton OptModel 
         Caption         =   "计时模式"
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
         Index           =   0
         Left            =   240
         TabIndex        =   5
         Top             =   720
         Value           =   -1  'True
         Width           =   1575
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "项目选择"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2775
      Left            =   3720
      TabIndex        =   0
      Top             =   1800
      Width           =   2655
      Begin VB.OptionButton OptProject 
         Caption         =   "加减乘除混合练习"
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
         Index           =   4
         Left            =   240
         TabIndex        =   11
         Top             =   2160
         Width           =   2295
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "除法单项练习"
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
         Index           =   3
         Left            =   240
         TabIndex        =   10
         Top             =   1680
         Width           =   1815
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "乘法单项练习"
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
         Index           =   2
         Left            =   240
         TabIndex        =   9
         Top             =   1200
         Width           =   1815
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "减法单项练习"
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
         Index           =   1
         Left            =   240
         TabIndex        =   8
         Top             =   720
         Width           =   1815
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "加法单项练习"
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
         Index           =   0
         Left            =   240
         TabIndex        =   7
         Top             =   240
         Value           =   -1  'True
         Width           =   1815
      End
   End
   Begin VB.Label Label1 
      Caption         =   "界面透明度设置："
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   600
      TabIndex        =   14
      Top             =   3960
      Width           =   1935
   End
   Begin VB.Image Image2 
      Height          =   1575
      Left            =   360
      Picture         =   "StartForm.frx":0ECE
      Stretch         =   -1  'True
      Top             =   0
      Width           =   2295
   End
   Begin VB.Image Image1 
      Height          =   1095
      Left            =   3120
      Picture         =   "StartForm.frx":267DE
      Stretch         =   -1  'True
      Top             =   360
      Width           =   3135
   End
End
Attribute VB_Name = "StartForm"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim i As Integer
Dim MsgEnd, MsgCopy As Integer
Public Model, Project As String

Private Sub Cmd1_Click()
If Len(ComboLevel.Text) = 0 Then
    MsgBox "请选择难度", vbOKOnly + vbCritical, "错误"
    Exit Sub
End If
Load AccecptForm
AccecptForm.Show
Me.Hide
End Sub

Private Sub Cmd2_Click()
MsgEnd = MsgBox("确定退出吗？", vbOKCancel + vbInformation, "退出")
If MsgEnd = 1 Then End
End Sub

Private Sub Cmd3_Click()
HelpForm.Show
End Sub

Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = vbKeyF1 Then HelpForm.Show
End Sub

Private Sub Form_Load()
On Error Resume Next
If Len(Dir("C:\WINDOWS\Fonts\方正卡通简体.ttf")) = 0 Then
    MsgCopy = MsgBox("是否复制字体文件？", vbInformation + vbOKCancel, "复制新文件")
    If MsgCopy = 1 Then
        FileCopy App.Path & "\" & "方正卡通简体.ttf", "C:\WINDOWS\Fonts\方正卡通简体.ttf"
        MsgBox "请手动重新启动程序", vbOKOnly + vbInformation, "关闭"
        End
    End If
End If
Call FormAlpha(Me, 255)
Call FormCenter(Me)
Model = "计时模式"
Project = "加法单项练习"
For i = 0 To 5
    ComboLevel.List(i) = Choose(i + 1, "十", "二十", "三十", "四十", "五十", "一百") & "以内"
Next
End Sub

Private Sub HScroll1_Change()
Call FormAlpha(Me, HScroll1.Value)
End Sub

Private Sub HScroll1_Scroll()
Call FormAlpha(Me, HScroll1.Value)
End Sub

Private Sub OptModel_Click(Index As Integer)
Model = OptModel(Index).Caption
End Sub

Private Sub OptProject_Click(Index As Integer)
Project = OptProject(Index).Caption
End Sub
