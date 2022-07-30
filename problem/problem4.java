package problem;
public class problem4 {
  static int getExcludeSpaceCount(String s) {
    int result = 0;
    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i) != ' ') {
        result++;
      }
    }
    return result;
  }
  public static void main(String[] args){
    System.out.println(getExcludeSpaceCount("공백을 제외한 글자수"));
    System.out.println(getExcludeSpaceCount("안녕하세용 박지현입니당"));
  }
}
