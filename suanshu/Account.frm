VERSION 5.00
Begin VB.Form Recorder 
   Caption         =   "Recorder"
   ClientHeight    =   3090
   ClientLeft      =   60
   ClientTop       =   450
   ClientWidth     =   4980
   LinkTopic       =   "Form1"
   ScaleHeight     =   3090
   ScaleWidth      =   4980
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "创建"
      Height          =   495
      Left            =   3480
      TabIndex        =   5
      Top             =   120
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      Caption         =   "确定"
      Height          =   495
      Left            =   120
      TabIndex        =   4
      Top             =   2400
      Width           =   1215
   End
   Begin VB.ListBox Account 
      Height          =   2220
      Left            =   1440
      TabIndex        =   3
      Top             =   720
      Width           =   3255
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   1440
      TabIndex        =   0
      Top             =   120
      Width           =   1815
   End
   Begin VB.Label Label2 
      Caption         =   "选择账户："
      Height          =   495
      Left            =   240
      TabIndex        =   2
      Top             =   840
      Width           =   1215
   End
   Begin VB.Label Label1 
      Caption         =   "新建账户："
      Height          =   495
      Left            =   240
      TabIndex        =   1
      Top             =   240
      Width           =   1215
   End
End
Attribute VB_Name = "Recorder"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit

Private Sub Command2_Click()
Open App.Path & "\" & Text1.Text & ".txt" For Output As #1
End Sub
