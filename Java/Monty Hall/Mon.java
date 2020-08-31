import java.util.*;

public class Mon{
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       Random ran=new Random();
       //Map<Integer,String> manager=new HashMap<>();
       System.out.print("検証回数>"); 
       int calcNum=Integer.parseInt(scan.nextLine());
      // System.out.println(calcNum);
       ArrayList<Integer> open=new ArrayList<>();
       int openNum=0;
       int badClear=0;
       int goodClear=0;
       for(int i=0;i<calcNum;i++){
          int target=ran.nextInt(3); 
          int choice=ran.nextInt(3);
          for(int j=0;j<3;j++){
              if(j!=target && j!=choice){
                  open.add(j);
              }
          }
          if(open.size()==2){
              openNum=open.get(ran.nextInt(2));
          }else{
              openNum=open.get(0);
          }
          System.out.printf("%d回目target%d,choice%d,openNum%d%n",i+1,target,choice,openNum);
          if(target==choice){
              badClear++;
          }else{
              goodClear++;
          }
          open=new ArrayList<>();
       }
       System.out.println("二度目の選択時に一度目に選んだものと同じものを選んだ場合は["+badClear+"]回成功した。");
       System.out.println("二度目の選択時に一度目に選んだものと違うものを選んだ場合は["+goodClear+"]回成功した。");
    }
}