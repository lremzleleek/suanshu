VERSION 5.00
Begin VB.Form ResultForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "���"
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
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton Cmd1 
      Caption         =   "ȷ��"
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
      Left            =   1080
      Style           =   1  'Graphical
      TabIndex        =   1
      Top             =   3000
      Width           =   2535
   End
   Begin VB.Label LabelSaying 
      BeginProperty Font 
         Name            =   "������ͨ����"
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
         Name            =   "������ͨ����"
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

If StartForm.Model = "��ʱģʽ" Then
    If GameForm.TimeSec = 0 Then
        Label.Caption = "��ϲ�ڹ涨ʱ���������ϰ"
    ElseIf GameForm.TimeSec <> 0 Then
        Label.Caption = "�㻹û�����������ϰ"
    End If
ElseIf StartForm.Model = "����ģʽ" Then
    Label.Caption = GameForm.LabelTime.Caption
End If
    
Label.Caption = Label.Caption & vbCrLf & vbCrLf & "һ��" & GameForm.AllNum & "��" & vbCrLf & _
"��ԣ�" & GameForm.RightNum & "��" & vbCrLf & _
"���" & GameForm.WrongNum & "��" & vbCrLf & _
"����ʣ�" & Mark & "%" & vbCrLf & vbCrLf

If Mark >= 80 Then
    LabelSaying.Caption = "���������"
ElseIf Mark < 80 And Mark >= 60 Then
    LabelSaying.Caption = "���У�"
ElseIf Mark < 60 Then
    LabelSaying.Caption = "Ҫ�����ˣ���̫����Ŷ��"
End If

Exit Sub

ErrLine:
Unload GameForm
Label.Caption = "�㻹û�������أ�"
End Sub

Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = vbKeyF1 Then HelpForm.Show
End Sub

