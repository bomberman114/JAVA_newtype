import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*  현재 결과값출력후 다시 입력을 하면 변수 b에 값들이 입력되서 숫자가 이상해지는 오류 발생 추후에
 *  확인하고 고칠것 ac버튼을 눌리면 리셋되서 다시 시작하면 되긴한다.
 */

public class Javaswing {
	//Fields -> 전역변수가 들어가는 자리 
	
	
	JFrame frame;
	JPanel panel;
	JLabel result;
	String total = null;
	// 전역변수 초기화
	String a = "";
	String b = "";
	int CalCase = 0;
	boolean count;

	//new -> 객체의 인스턴스화
// 전역변수 자리에 JFram Frame; -> 이건 그냥. Frame은 JFrame이다. 라고 선언만 한것.
	
	// method -> 메소드 -> 함수
	public void Layout() {
		frame = new JFrame();
		panel = new JPanel();
		// button 생성, Frame과 
		
		JButton btn_num1 = new JButton("1");
		JButton btn_num2 = new JButton("2");
		JButton btn_num3 = new JButton("3");
		JButton btn_num4 = new JButton("4");
		JButton btn_num5 = new JButton("5");
		JButton btn_num6 = new JButton("6");
		JButton btn_num7 = new JButton("7");
		JButton btn_num8 = new JButton("8");
		JButton btn_num9 = new JButton("9");
		JButton btn_num0 = new JButton("0");

		JButton btn_plus = new JButton("+");
		JButton btn_minus = new JButton("-");
		JButton btn_mul = new JButton("*");
		JButton btn_div = new JButton("/");

		JButton btn_equal = new JButton("=");

		JButton btn_reset = new JButton("ac");

		//button 생성끝
		
		result = new JLabel("0", JLabel.RIGHT);

		panel.setLayout(null);

		// panel에 요소들 추가
		panel.add(result);
		panel.add(btn_plus);
		panel.add(btn_minus);
		panel.add(btn_mul);
		panel.add(btn_div);
		panel.add(btn_num1);
		panel.add(btn_num2);
		panel.add(btn_num3);
		panel.add(btn_num4);
		panel.add(btn_num5);
		panel.add(btn_num6);
		panel.add(btn_num7);
		panel.add(btn_num8);
		panel.add(btn_num9);
		panel.add(btn_num0);
		panel.add(btn_equal);
		panel.add(btn_reset);
//panel.add(버튼들)-> 이제 panel이라는 변수안에 위에서 만드는 버튼이 들어감.
		
		// 각 요소 레이아웃에 배치
		result.setBounds(50, 50, 230, 50);
		btn_plus.setBounds(50, 110, 50, 50);
		btn_minus.setBounds(110, 110, 50, 50);
		btn_mul.setBounds(170, 110, 50, 50);
		btn_div.setBounds(230, 110, 50, 50);
		btn_num1.setBounds(50, 170, 50, 50);
		btn_num2.setBounds(110, 170, 50, 50);
		btn_num3.setBounds(170, 170, 50, 50);
		btn_num4.setBounds(50, 230, 50, 50);
		btn_num5.setBounds(110, 230, 50, 50);
		btn_num6.setBounds(170, 230, 50, 50);
		btn_num7.setBounds(50, 290, 50, 50);
		btn_num8.setBounds(110, 290, 50, 50);
		btn_num9.setBounds(170, 290, 50, 50);
		btn_num0.setBounds(50, 350, 170, 50);
		btn_equal.setBounds(230, 170, 50, 110);
		btn_reset.setBounds(230, 290, 50, 110);

		// 이벤트 발생 addActionListener -> 무언가가 클릭 되었을때 (대표적으로는 버튼), addMoiseLister > 이런것도 있다
		//이게 마우스가 클릭되었을때, 클릭하는 중일때 , 클릭하다가 손을 땟을때, 마우스포인터가 어딘가에 들어갔을때, 어딘가에서 나왔을때 이렇게 지정가능함.
		//이벤트를 연결해주는곳. -? 이거 안해주면 버튼 클릭했을때 아무런 반응도 없음. 생명을 불어넣는 다라는 느낌. 이거 안해주면 그냥 버튼이라는 모양만 있는거
		btn_num1.addActionListener(new Calculate());
		btn_num2.addActionListener(new Calculate());
		btn_num3.addActionListener(new Calculate());
		btn_num4.addActionListener(new Calculate());
		btn_num5.addActionListener(new Calculate());
		btn_num6.addActionListener(new Calculate());
		btn_num7.addActionListener(new Calculate());
		btn_num8.addActionListener(new Calculate());
		btn_num9.addActionListener(new Calculate());
		btn_num0.addActionListener(new Calculate());

		btn_plus.addActionListener(new Arithmetic());
		btn_minus.addActionListener(new Arithmetic());
		btn_mul.addActionListener(new Arithmetic());
		btn_div.addActionListener(new Arithmetic());

		btn_equal.addActionListener(new Equal());
		btn_reset.addActionListener(new AllClear());
// 버튼을 패널에 넣고 그다음에 패널통째로 프레임에 넣기
		//이제 여기서 Frame에다가 Panel을 집어 넣는다. -> 
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setVisible(true);
	// 여기까지 가 버튼 만들고 버튼에 이벤트 연결하고 Panel과
	}
	

	public static void main(String[] args) {
		Javaswing SwingCal = new Javaswing();
		SwingCal.Layout();

	}

	class Calculate implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if (count == false) {
				if (btn.getText().equals("1")) {
					a += "1";
					result.setText(a);
				} else if (btn.getText().equals("2")) {
					a += "2";
					result.setText(a);
				} else if (btn.getText().equals("3")) {
					a += "3";
					result.setText(a);
				} else if (btn.getText().equals("4")) {
					a += "4";
					result.setText(a);
				} else if (btn.getText().equals("5")) {
					a += "5";
					result.setText(a);
				} else if (btn.getText().equals("6")) {
					a += "6";
					result.setText(a);
				} else if (btn.getText().equals("7")) {
					a += "7";
					result.setText(a);
				} else if (btn.getText().equals("8")) {
					a += "8";
					result.setText(a);
				} else if (btn.getText().equals("9")) {
					a += "9";
					result.setText(a);
				} else if (btn.getText().equals("0")) {
					a += "0";
					result.setText(a);
				}
			} else if (count == true) {
				if (btn.getText().equals("1")) {
					b += "1";
					result.setText(b);
				} else if (btn.getText().equals("2")) {
					b += "2";
					result.setText(b);
				} else if (btn.getText().equals("3")) {
					b += "3";
					result.setText(b);
				} else if (btn.getText().equals("4")) {
					b += "4";
					result.setText(b);
				} else if (btn.getText().equals("5")) {
					b += "5";
					result.setText(b);
				} else if (btn.getText().equals("6")) {
					b += "6";
					result.setText(b);
				} else if (btn.getText().equals("7")) {
					b += "7";
					result.setText(b);
				} else if (btn.getText().equals("8"))
					b += "8";
				else if (btn.getText().equals("9")) {
					b += "9";
					result.setText(b);
				} else if (btn.getText().equals("0")) {
					b += "0";
					result.setText(b);
				}
			}
		}
	}

	class Arithmetic implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			count = true;
			if (btn.getText().equals("+")) {
				CalCase = 1;
				result.setText(a+"+");}
			else if (btn.getText().equals("-")) {

				CalCase = 2;
				result.setText(a+"-");}
			else if (btn.getText().equals("*")) {

				CalCase = 3;
				result.setText(a+"*");}
			else if (btn.getText().equals("/")) {

				CalCase = 4;
				result.setText(a+"/");}
		}
	}

	class Equal implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (CalCase == 1) {
				total = Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
				result.setText(a+"+"+b+"="+total); 
				
			} else if (CalCase == 2) {
				total = Integer.toString(Integer.parseInt(a) - Integer.parseInt(b));
				result.setText(a+"-"+b+"="+total);
				
			} else if (CalCase == 3) {
				total = Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
				result.setText(a+"*"+b+"="+total);
				
			} else if (CalCase == 4) {
				total = Integer.toString(Integer.parseInt(a) / Integer.parseInt(b));
				result.setText(a+"/"+b+"="+total);
				
			}
			a= total; 
			b="";
			CalCase = 0;
		}
	}

	class AllClear implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			a = "";
			b = "";
			CalCase = 0;
			total = null;
			result.setText("0");
			count = false;
		}
	}
}