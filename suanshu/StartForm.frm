VERSION 5.00
Begin VB.Form StartForm 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "������"
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
   StartUpPosition =   3  '����ȱʡ
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
      Left            =   2760
      TabIndex        =   3
      Top             =   4800
      Width           =   1455
   End
   Begin VB.CommandButton Cmd2 
      BackColor       =   &H00E0E0E0&
      Caption         =   "�˳�"
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
      Left            =   4920
      TabIndex        =   4
      Top             =   4800
      Width           =   1455
   End
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
      Left            =   600
      TabIndex        =   2
      Top             =   4800
      Width           =   1455
   End
   Begin VB.Frame Frame2 
      Caption         =   "ģʽ�Ѷ�ѡ��"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
            Name            =   "������ͨ����"
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
         Caption         =   "����ģʽ"
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
         Index           =   1
         Left            =   240
         TabIndex        =   6
         Top             =   1200
         Width           =   1575
      End
      Begin VB.OptionButton OptModel 
         Caption         =   "��ʱģʽ"
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
         Index           =   0
         Left            =   240
         TabIndex        =   5
         Top             =   720
         Value           =   -1  'True
         Width           =   1575
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "��Ŀѡ��"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
         Caption         =   "�Ӽ��˳������ϰ"
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
         Index           =   4
         Left            =   240
         TabIndex        =   11
         Top             =   2160
         Width           =   2295
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "����������ϰ"
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
         Index           =   3
         Left            =   240
         TabIndex        =   10
         Top             =   1680
         Width           =   1815
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "�˷�������ϰ"
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
         Index           =   2
         Left            =   240
         TabIndex        =   9
         Top             =   1200
         Width           =   1815
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "����������ϰ"
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
         Index           =   1
         Left            =   240
         TabIndex        =   8
         Top             =   720
         Width           =   1815
      End
      Begin VB.OptionButton OptProject 
         Caption         =   "�ӷ�������ϰ"
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
         Index           =   0
         Left            =   240
         TabIndex        =   7
         Top             =   240
         Value           =   -1  'True
         Width           =   1815
      End
   End
   Begin VB.Label Label1 
      Caption         =   "����͸�������ã�"
      BeginProperty Font 
         Name            =   "������ͨ����"
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
    MsgBox "��ѡ���Ѷ�", vbOKOnly + vbCritical, "����"
    Exit Sub
End If
Load AccecptForm
AccecptForm.Show
Me.Hide
End Sub

Private Sub Cmd2_Click()
MsgEnd = MsgBox("ȷ���˳���", vbOKCancel + vbInformation, "�˳�")
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
If Len(Dir("C:\WINDOWS\Fonts\������ͨ����.ttf")) = 0 Then
    MsgCopy = MsgBox("�Ƿ��������ļ���", vbInformation + vbOKCancel, "�������ļ�")
    If MsgCopy = 1 Then
        FileCopy App.Path & "\" & "������ͨ����.ttf", "C:\WINDOWS\Fonts\������ͨ����.ttf"
        MsgBox "���ֶ�������������", vbOKOnly + vbInformation, "�ر�"
        End
    End If
End If
Call FormAlpha(Me, 255)
Call FormCenter(Me)
Model = "��ʱģʽ"
Project = "�ӷ�������ϰ"
For i = 0 To 5
    ComboLevel.List(i) = Choose(i + 1, "ʮ", "��ʮ", "��ʮ", "��ʮ", "��ʮ", "һ��") & "����"
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
