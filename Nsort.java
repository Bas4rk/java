package test01;

public class sample01 {

	public static void main(String[] args) {
	
		A monlist[] = new A[100];
		//aa
		A a = new A("asdbasdg");
		monlist[0] = a;
		
		A b = new A("aa");
		monlist[1] = b;
		
		A c = new A("zagsga");
		monlist[2] = c;
		
		for(int i = 0;i<3;i++){
			System.out.println(monlist[i].name());
		}
		
		System.out.println("-------------");
		
		String list[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","z"};
		
		int count = 1 ;
		
		
		for(int i = 2;i>0;i--){
			for(int n = 0;n<i;n++){
				
				int mozisu = 1;
				
				System.out.println(count+++"���");
				
				String fmName = monlist[n].name();
				String smName =monlist[n+1].name();
				
				String fmfn = fmName.substring(mozisu-1,mozisu);
				String smfn = smName.substring(mozisu-1,mozisu);
				
				System.out.println("fm1�����ڂ�"+fmfn);
				System.out.println("sm1�����ڂ�"+smfn);
				
				int fmNumber =0;
				int smNumber =0;
				
				for(int k = 0;k<list.length;k++){
					if(fmfn.equals(list[k])){
						fmNumber = k;
						break;
					}
				}
				
				for(int k = 0;k<list.length;k++){
					if(smfn.equals(list[k])){
						smNumber = k;
						break;
					}
				}
				
				while(fmNumber == smNumber){
					
					if(fmName.length() ==mozisu){
						fmNumber = 0;
						smNumber = 1;
					}else if(smName.length() ==mozisu){
						fmNumber = 1;
						smNumber = 0;
					}else{
						
						mozisu++;
						fmNumber *= 10;
						smNumber *= 10;
						
						String fmxn = fmName.substring(mozisu-1,mozisu);
						String smxn = smName.substring(mozisu-1,mozisu);
						
						System.out.println("fm"+mozisu+"�����ڂ�"+fmxn);
						System.out.println("sm"+mozisu+"�����ڂ�"+smxn);
						
						
						for(int k = 0;k<list.length;k++){
							if(fmxn.equals(list[k])){
								fmNumber += k;
								break;
							}
						}
						
						for(int k = 0;k<list.length;k++){
							if(smxn.equals(list[k])){
								smNumber += k;
								break;
							}
						}
					}
				}
				
				
				A box;
				
				if(fmNumber > smNumber){
					box = monlist[n];
					monlist[n] = monlist[n+1];
					monlist[n+1] = box;
					
					System.out.println(fmName+"��"+fmNumber+"��"+smName+"��"+smNumber+"�Ȃ̂œ���ւ����挻�݂́�");
				}
				
				for(int z = 0;z<3;z++){
					System.out.println(monlist[z].name());
				}
			}
		}
		
		System.out.println("----�\�[�g����------");
		for(int i = 0;i<3;i++){
			System.out.println(monlist[i].name());
		}
	}
}


class A {
	String name;
	A(String a){
		name = a;
	}
	
	String name(){
		return this.name;
		
	}
}