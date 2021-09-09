package newpackage.Marks;

public class B extends Marks {
	double math , science , social,computer;


    B (int i , int j , int k, int l)
    {
        this.computer=l;
        this.math=i;
        this.social=j;
        this.science=k;
    }
  void 	getPercentage() {
	  
	  double percentage;
	  
	  percentage = ((math+science+social+computer)/400)*100;
      System.out.println(percentage);

}
