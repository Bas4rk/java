package test01;

public class sample2 {

	public static void main(String[] args) {
		
		int count = 0;
		B monlist[] = new B[100];
		//aa
		B a = new B("aaasdbasdg");
		monlist[count] = a;
		count++;
		B b = new B("zaaa");
		monlist[count] = b;
		count++;
		B c = new B("zagsga");
		monlist[count] = c;
		count++;
		B d = new B("aasdagsga");
		monlist[count] = d;
		count++;
		B e = new B("bagsgaas");
		monlist[count] = e;
		count++;
		
		//�T����������
		String look = "aas";
		
		//�T�����������������X�g�Ɋi�[
		String list[] = new String[100];
		int h=0;
		for(;h<look.length();h++){
			list[h]= look.substring(h,h+1);
		}
		
		//�����X�^�[�̐���
		for(int i = 0;i<count;i++){	
			String monName =monlist[i].getName();
			int discovery = 0;
			//�����X�^�[���̕��������Ō�܂Ō���B
			for(int k = 0;k<monName.length();k++){
				
				if(discovery == 1){
					break;
				}
				
				String monSname = monName.substring(k,k+1);
				System.out.println(i+"�Ԗڂ̃����X�^�[��"+(k+1)+"�����ڂ�"+monSname+"�ł�");
				int nameCount = 0;
				
				
					//�����X�^�[��������������Ɠ�����
					while(monSname.equals(list[nameCount]) && k+look.length() <= monName.length()){
					
						if(nameCount == look.length()-1){
							System.out.println(monlist[i].getName());
							discovery =1;
							break;
						}
						nameCount++;
						System.out.println("�����ŃG���[�łĂ�"+(k+nameCount)+""+(k+1+nameCount));
						monSname = monName.substring((k+nameCount),(k+1+nameCount));
					}
			}
		}
	}

}

class B {
	String name;
	B(String a){
		name = a;
	}
	
	String getName(){
		return this.name;
	}
}