package a_variable;

public class Vriable {

	public static void main(String[] args) {
		/*
		 * <<변수 >>>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수 : byte, short, int, long
		 * - 실수 : float, double
		 * - 문자 : char
		 * - 논리 : boolean
		 * 
		 * byte는 8개의 bit로 이루어져 있다.
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 *   그것의 이름이 무엇인지 알려줘야 한다.
		 * - 명명규칙은 자바의정석 25~26쪽 참조
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte abc;
		char moonja;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		byte EG;
		short QW;
		int ER;
		long DF;
		float GE;
		double PO;
		char QE;
		boolean NM;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
//		System.out.println(EG); /컴파일 에러 발생(문법이 틀렸다)
		//변수의 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		EG = 127; //타입에 맞는 값을 저장해야 한다. byte 
		QW = 30000; //short
		ER = 20; //int
		DF = 900L; //long 접미사 : L
		GE = 3.14f; //float 접미사 : f
		PO = 3.14; //double 접미사 : d(생략가능)
		QE = '가'; //char
		NM = true; //boolean
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(ER);
		//Ctrl + F11 : 프로그램 실행
		//F11 : 디버그 모드로 실행
		
		ER = 30;
		System.out.println(ER);
		ER = 30 + 40;
		System.out.println(ER);
		ER = QW;
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		EG = 50;
		QW = 10000;
		ER = 30;
		DF = 800L;
		GE = 3.13f;
		PO = 3.13;
		QE = '나';
		NM = false;
		
		System.out.println(EG);
		System.out.println(QW);
		System.out.println(ER);
		System.out.println(DF);
		System.out.println(GE);
		System.out.println(PO);
		System.out.println(QE);
		System.out.println(NM);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스 
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * <<리터럴의 종류>>
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자 : '가', 'a', '0', ' '(공백 하나라도 있어야 문자로 인식)
		 * 문자열 : "가나다", "abc", "123", "  ", ""(문자열은 공백이없어도 문자열)
		 * 그외 : true, false, null(값이 없다)
		 * 
		 * << 참조형 타입 >>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값
		EG = 0;						//byte EG;
		QW = 0;						//short QW;
		ER = 0;						//int ER;
		DF = 0L;					//long DF;
		GE = 0.0f;					//float GE;
		PO = 0.0;					//double PO;
		QE = '\u0000';//' '			//char QE;
		NM = false;					//boolean NM;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		EG = 127;
		QW = 128;
		EG = (byte)QW; // 형변환 : 데이터 타입을 변환하는 것
		System.out.println(EG); //128 -> -128 (오버플로우)
		
		EG = -128;
		QW = -129;
		EG = (byte)QW;
		System.out.println(EG); //-129 -> 127(언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		//double 타입에서 int 타입으로 형변환해서 출력해주세요.
		PO = 3.14;
		ER = (int)PO;
		System.out.println(ER); //int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		//_int = _byte;
		//_long = _int;
		//_double = _int;
		//_double = _float; //표현범위가 작은 타입에서 큰타입으로 형변환하는 경우
		
		/*
		 *  <<상수>>
		 *  - 값을 한번 저장하면 변경할 수 없는 저장공간
		 *  - final int MAX_NUMBER = 10;
		 *  - 리터럴에 의미를 부여하기 위해 사용한다.
		 *  - 상수는 전부다 대문자로 만들어준다.
		 *  - 변수는 보통 소문자를 사용한다. 
		 */ 
		 final int MAX_NUMBER;
		 MAX_NUMBER = 10;
//		 MAX_NUMBER = 100; //컴파일 에러 발생
		 
		 
	}	
	
}		
