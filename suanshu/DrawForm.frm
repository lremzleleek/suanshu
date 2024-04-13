VERSION 5.00
Begin VB.Form DrawForm 
   BorderStyle     =   0  'None
   Caption         =   "Form1"
   ClientHeight    =   4680
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   4695
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   4680
   ScaleWidth      =   4695
   ShowInTaskbar   =   0   'False
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "清屏"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1455
      Left            =   120
      TabIndex        =   5
      Top             =   360
      Width           =   495
   End
   Begin VB.CommandButton Command1 
      Caption         =   "关闭"
      BeginProperty Font 
         Name            =   "方正卡通简体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1455
      Left            =   120
      TabIndex        =   4
      Top             =   2760
      Width           =   495
   End
   Begin VB.PictureBox Picshow 
      BackColor       =   &H00FFFFFF&
      BorderStyle     =   0  'None
      DrawWidth       =   2
      Height          =   4455
      Left            =   840
      MousePointer    =   2  'Cross
      ScaleHeight     =   4455
      ScaleWidth      =   3735
      TabIndex        =   0
      Top             =   120
      Width           =   3735
      Begin VB.Line Line1 
         BorderWidth     =   3
         X1              =   120
         X2              =   3600
         Y1              =   1680
         Y2              =   1680
      End
      Begin VB.Label Lab1 
         Alignment       =   1  'Right Justify
         Appearance      =   0  'Flat
         AutoSize        =   -1  'True
         BackColor       =   &H80000005&
         BackStyle       =   0  'Transparent
         Caption         =   "99"
         BeginProperty Font 
            Name            =   "黑体"
            Size            =   42
            Charset         =   134
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H80000008&
         Height          =   840
         Left            =   2280
         TabIndex        =   3
         Top             =   120
         Width           =   870
      End
      Begin VB.Label Lab2 
         Alignment       =   1  'Right Justify
         Appearance      =   0  'Flat
         AutoSize        =   -1  'True
         BackColor       =   &H80000005&
         BackStyle       =   0  'Transparent
         Caption         =   "99"
         BeginProperty Font 
            Name            =   "黑体"
            Size            =   42
            Charset         =   134
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H80000008&
         Height          =   840
         Left            =   2280
         TabIndex        =   2
         Top             =   840
         Width           =   870
      End
      Begin VB.Label Lab3 
         Alignment       =   1  'Right Justify
         Appearance      =   0  'Flat
         AutoSize        =   -1  'True
         BackColor       =   &H80000005&
         BackStyle       =   0  'Transparent
         Caption         =   "+"
         BeginProperty Font 
            Name            =   "黑体"
            Size            =   42
            Charset         =   134
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         ForeColor       =   &H80000008&
         Height          =   840
         Left            =   480
         TabIndex        =   1
         Top             =   840
         Width           =   435
      End
   End
End
Attribute VB_Name = "DrawForm"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim Xstart, Ystart As Integer


Private Sub Command1_Click()
Unload Me
End Sub

Private Sub Command2_Click()
Picshow.Cls
End Sub

Private Sub Form_Load()
Call FormAlpha(Me, StartForm.HScroll1.Value)
Me.Height = GameForm.Height
Me.Left = GameForm.Left + GameForm.Width
Me.Top = GameForm.Top

Lab1.Caption = GameForm.a
Lab2.Caption = GameForm.b
If GameForm.c = 4 Then
    Lab1.Top = 960: Lab1.Left = 1900
    Lab2.Top = 960: Lab2.Left = 600
    Lab3.Caption = ")": Lab3.Top = 960: Lab3.Left = 1560
    With Line1
        .X1 = 1560: .X2 = 3000: .Y1 = 1020: .Y2 = 1020
    End With
Else
    Lab3.Caption = Choose(GameForm.c, "＋", "－", "×")
End If
End Sub

Private Sub Form_LostFocus()
Unload Me
End Sub

Private Sub Picshow_MouseDown(Button As Integer, Shift As Integer, X As Single, Y As Single)
Xstart = X
Ystart = Y
End Sub

Private Sub Picshow_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
If Button = vbLeftButton Then
    Picshow.AutoRedraw = True
    Picshow.Line (Xstart, Ystart)-(X, Y)
    Xstart = X
    Ystart = Y
End If
End Sub
