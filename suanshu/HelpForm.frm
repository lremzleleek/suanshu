VERSION 5.00
Begin VB.Form HelpForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "����"
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
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton Command3 
      Caption         =   "����˵��"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
      Caption         =   "����˵��"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
         Name            =   "����"
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
      Caption         =   "����"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
Text.Text = "V1.1.0���£�" & vbCrLf & _
"1.������û�и����������𰸶���������" & vbCrLf & _
"2.��������У��������Ŵ�Ӵ֡�" & vbCrLf & _
"3.�޸����ڡ�����ģʽ���а���ͣû��Ч����BUG��" & vbCrLf & _
"4.��������ȫ��İ档" & vbCrLf & _
"5.���ӽ���͸�������á�" & vbCrLf & _
"6.�޸��˼���������ϰ��BUG��" & vbCrLf & vbCrLf & _
"V1.1.2���£� " & vbCrLf & _
"1.����ͼ��İ棬�����Ż�" & vbCrLf & vbCrLf & _
"V1.1.3���£� " & vbCrLf & _
"1.�����Զ�ֲ�뷽����ͨ����" & vbCrLf & vbCrLf & _
"V1.1.4���£� " & vbCrLf & _
"1.����ϸ΢����" & vbCrLf & _
"2.�Ż����ִ���" & vbCrLf & _
"V1.2.0���£� " & vbCrLf & _
"1.���Ӳݸ崰�壬�����Ƚϸ��ӵ���Ŀ������ʽ" & vbCrLf & vbCrLf & _
"1.�޸�һЩСBUG"
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

