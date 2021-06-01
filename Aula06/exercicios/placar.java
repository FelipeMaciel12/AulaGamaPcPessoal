package exercicios;

public class placar {
    
  private  String time1, time2;
  private  int res1, res2;

    public placar(){
       // time1="Time da Casa";
       // time2="Visitante";
       this("Time da Casa","Visitante",0,0);
    }   

    // overload polimorfismo chamar o mesmo construtor de diferentes formas
    public placar (String time1, String time2){
       // this.time1=time1;
       // this.time2=time2;
       this(time1,time2,0,0);
    }
    // overload polimorfismo chamar o mesmo construtor de diferentes formas
    public placar (String time1, String time2, int res1, int res2) {
        this.time1=time1;
        this.time2=time2;
        this.res1=res1;
        this.res2=res2;
    }
    // imprimindo o placar do jogo
    public String imprimePlacar(){
        return time1 + " " + res1 + " X " + res2 +" "+time2;
    }

    public void validaPlacar(){
        
    }
}
