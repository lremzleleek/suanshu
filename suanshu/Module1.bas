Attribute VB_Name = "Module1"
'����͸��
Public Declare Function SetLayeredWindowAttributes Lib "user32" (ByVal hwnd As Long, ByVal crKey As Long, ByVal bAlpha As Byte, ByVal dwFlags As Long) As Long
Public Declare Function SetWindowLong Lib "user32" Alias "SetWindowLongA" (ByVal hwnd As Long, ByVal nIndex As Long, ByVal dwNewLong As Long) As Long
Public Declare Function GetWindowLong Lib "user32" Alias "GetWindowLongA" (ByVal hwnd As Long, ByVal nIndex As Long) As Long
Public Const WS_EX_LAYERED = &H80000
Public Const GWL_EXSTYLE = (-20)
Public Const LWA_ALPHA = 2
Public Const LWA_COLORKEY = 1

Sub FormAlpha(FormName As Form, Alpha As Integer)
SetWindowLong FormName.hwnd, GWL_EXSTYLE, WS_EX_LAYERED Or GetWindowLong(FormName.hwnd, GWL_EXSTYLE)
SetLayeredWindowAttributes FormName.hwnd, vbBlue, Alpha, LWA_ALPHA
End Sub

Sub FormCenter(FormName As Form)
FormName.Left = Screen.Width / 2 - FormName.Width / 2
FormName.Top = Screen.Height / 2 - FormName.Height / 2
End Sub

Sub HelpText(TextName As TextBox)
TextName.text = Space(4) & "1.��ʼ�����У���Ŀѡ��ģ�齫ѡ������������ͣ���Ϊ���ֵ�����ϰ��һ�ֻ����ϰ����Ŀ�����������" & vbCrLf & _
Space(4) & "2.��ʼ�����У�ģʽ�Ѷ�ѡ��ģ�齫ѡ����ġ������Ѷȡ��롰����ģʽ��" & vbCrLf & _
Space(4) & "3.������ģʽ���еġ���ʱģʽ��������ϰ��ʼ֮ǰҪ��������ϰ����ʱ�䣬�㽫���趨��ʱ��֮�ھ����ܶ����������⣬�����֮�󣬰��س�����ʾȷ�����ɽ�����һ�⡣" & vbCrLf & _
Space(4) & "4.������ģʽ��������ϰ��ʼ֮ǰҪ������ÿ��֮���ʱ��������ϰ��ʼ֮�����谴�س�����������Զ��������úõ�ʱ������ÿ��һ��ʱ���Զ��ж϶Դ�������һ�⡣" & vbCrLf & _
Space(4) & "5.������ã�ȷ�����ñ�ɽ�����ϰ��" & vbCrLf & _
Space(4) & "6.��Ϸ�����У��������ʼ������ʾ����ʱ�䣬���֮������ϰ���������ͣ������ʱֹͣ��ͬʱ��Ŀ���ء���������ء����ɷ��ؿ�ʼ��������ѡ�񡣵�����˳�������ǿ�� ֹͣ��ϰ��" & vbCrLf & _
Space(4) & "7.��������н���ʾ���������" & vbCrLf & _
Space(4) & "8.��F1����ʱ�����������档"
End Sub


