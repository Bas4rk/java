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
		
		//探したい文字
		String look = "aas";
		
		//探したい文字数分リストに格納
		String list[] = new String[100];
		int h=0;
		for(;h<look.length();h++){
			list[h]= look.substring(h,h+1);
		}
		
		//モンスターの数分
		for(int i = 0;i<count;i++){	
			String monName =monlist[i].getName();
			int discovery = 0;
			//モンスター名の文字数分最後まで見る。
			for(int k = 0;k<monName.length();k++){
				
				if(discovery == 1){
					break;
				}
				
				String monSname = monName.substring(k,k+1);
				System.out.println(i+"番目のモンスターの"+(k+1)+"文字目は"+monSname+"です");
				int nameCount = 0;
				
				
					//モンスター名が検索文字列と同じか
					while(monSname.equals(list[nameCount]) && k+look.length() <= monName.length()){
					
						if(nameCount == look.length()-1){
							System.out.println(monlist[i].getName());
							discovery =1;
							break;
						}
						nameCount++;
						System.out.println("ここでエラーでてる"+(k+nameCount)+""+(k+1+nameCount));
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