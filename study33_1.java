package test;

public class study33_1 {
   public int score;

   public int getScore() {
      return score;
   }

   public void setScore(int score) {
      this.score = score;
   }
   
}

//public void setId0(Data id) {
//    this.id = id;
// }
// 
// public void setId(String id) {
//    this.id.setData(id);
// }

/*
 *  데이터 클래스가 있다. 그 클라스에는 string 데이터를 선언했고
 *  그에 따른 setter getter가 있다.
 * 	다른 클래스에서 클래스 데이터 타입으로 id, p/w 등으로 객체 선언을 해주면 
 * 	id / pw 등은 데이터 타입이 된다. 하지만 여기에 값을 넣기 위해선 
 * 	단순히 setter을 사용하여 넣을수 없다. 단순한 setter은 
 * 
//  public void setId0(Data id) {
//    this.id = id;
// }
 * 
 * 
 * 	이렇게 될텐데  이렇게 되면 data 타입으로 값을 넣기가 어렵기 때문에
 * string으로 넣기 위해서 변형해줘야한다. 다음은 string 으로 setter을 설정했다.
//  public void setId(String id) {
//    this.id.setData(id);
// }
 * 
 * 
 */