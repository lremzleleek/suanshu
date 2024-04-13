VERSION 5.00
Begin VB.Form GameForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "��Ϸ"
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
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton CmdDraw 
      Caption         =   "�򿪲ݸ�"
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
      Left            =   5280
      TabIndex        =   3
      Top             =   3600
      Width           =   1815
   End
   Begin VB.CommandButton CmdStart 
      BackColor       =   &H00E0E0E0&
      Caption         =   "��ʼ"
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
      Left            =   360
      TabIndex        =   1
      Top             =   3600
      Width           =   1815
   End
   Begin VB.TextBox Text 
      BackColor       =   &H00FFFFFF&
      Enabled         =   0   'False
      BeginProperty Font 
         Name            =   "����"
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
      Caption         =   "��ͣ"
      Enabled         =   0   'False
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
      Caption         =   "ʱ��"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
      Caption         =   "�Դ�"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
         Name            =   "����"
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

CmdPause.Caption = IIf(CmdPause.Caption = "��ͣ", "����", "��ͣ")
TimerAll.Enabled = Not TimerAll.Enabled
TimerEach.Enabled = Not TimerEach.Enabled
Text.Enabled = Not Text.Enabled
ImageRest.Visible = Not ImageRest.Visible
End Sub

Private Sub CmdStart_Click()
On Error GoTo ErrLine
Call FaceNormal

If StartForm.Model = "��ʱģʽ" Then
    TimeSec = Int(InputBox("��������ʱ�䣨�룩", "��ʱģʽ����"))
    If TimeSec <= 0 Then
        MsgBox "��������ȷ��ʱ��", vbOKOnly + vbCritical, "����"
        Exit Sub
    End If
ElseIf StartForm.Model = "����ģʽ" Then
    TimeEach = Int(InputBox("������ÿ��ʱ�������룩", "����ģʽ����"))
    If TimeEach <= 0 Then
ErrLine: MsgBox "��������ȷ��ʱ��", vbOKOnly + vbCritical, "����"
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
CmdStop.Caption = "ֹͣ"

Call Game
End Sub

Private Sub CmdStop_Click()
Call FaceNormal
If CmdStop.Caption = "ֹͣ" Then
    If StartForm.Model = "��ʱģʽ" Then
        MsgEnd = MsgBox("ȷ��ֹͣ�𣿻�û�н���", vbOKCancel + vbInformation, "ֹͣ")
        If MsgEnd = 1 Then ResultForm.Show: Unload Me: Unload DrawForm
    ElseIf StartForm.Model = "����ģʽ" Then
        MsgEnd = MsgBox("ȷ��ֹͣ��", vbOKCancel + vbInformation, "ֹͣ")
        If MsgEnd = 1 Then ResultForm.Show: Unload Me: Unload DrawForm
    End If
    CmdDraw.Enabled = False
Else
    MsgEnd = MsgBox("ȷ��������", vbOKCancel + vbInformation, "����")
    If MsgEnd = 1 Then
        Unload Me: Unload DrawForm
        Load StartForm: StartForm.Show
    End If
End If
End Sub

Private Sub Text_KeyPress(KeyAscii As Integer)
If StartForm.Model = "��ʱģʽ" And KeyAscii = vbKeyReturn Then
    Call IsRight
    Call Game
    AllNum = AllNum + 1
    Unload DrawForm
End If
End Sub

Private Sub TimerAll_Timer()
If StartForm.Model = "��ʱģʽ" Then
    TimeSec = Val(TimeSec) - 1
    LabelTime.Caption = "ʣ��" & TimeSec & "��"
    If TimeSec = 0 Then
        MsgBox "ʱ�䵽��", vbOKOnly + vbInformation, "��ʾ"
        ResultForm.Show: Unload Me: Unload DrawForm
    End If
ElseIf StartForm.Model = "����ģʽ" Then
    TimeSec = Val(TimeSec) + 1
    LabelTime.Caption = "����" & TimeSec & "��"
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
Case "�ӷ�������ϰ"
    c = 1
Case "����������ϰ"
    c = 2
Case "�˷�������ϰ"
    c = 3
Case "����������ϰ"
    c = 4
Case "�Ӽ��˳������ϰ"
    c = Choose(Int(Rnd() * 4 + 1), 1, 2, 3, 4)
End Select

line:
Randomize
a = Int(Rnd() * AccecptForm.Level)
b = Int(Rnd() * AccecptForm.Level)

Select Case c
Case 1
    Key = a + b
    Label.Caption = a & "��" & b & "="
Case 2
    Key = a - b
    If Key < 0 Then GoTo line
    Label.Caption = a & "��" & b & "="
Case 3
    Key = a * b
    Label.Caption = a & "��" & b & "="
Case 4
    If b = 0 Then GoTo line
    Key = a / b
    If Key < 1 Or Key <> Int(Key) Then GoTo line
    Label.Caption = a & "��" & b & "="
End Select
End Sub

Sub IsRight()
ImageNormal.Visible = False
If Val(Text.Text) = Key Then
    LabelAnswer.Caption = "�����"
    ImageSmile.Visible = True
    ImageCry.Visible = False
    RightNum = RightNum + 1
Else
    LabelAnswer.Caption = "�����"
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
