public class Where {
    public static void main(String[] args) {
    String text = "{\"name\":\"Ivanov\", \"country\":\"null\", \"city\":\"Moscow\", \"age\":\"20\"}";
    
    // Обрезаем фигуные скобки
    String text1 = text.substring(1, text.length() - 1);
    //System.out.println(text1);

    // Массив строк из ключа и значения
    String[] keyWithVal = text1.split(", ");
    //System.out.println(Arrays.toString(keyWithVal));    

    StringBuilder res = new StringBuilder();
    boolean flag = true;

    for (String item : keyWithVal) {
      String[] keyValue = item.split(":"); // Разделяем каждую пару на ключ и значение
      String key = keyValue[0].replace("\"", ""); // Избавляемся от \"
      String value = keyValue[1].replace("\"", ""); // Избавляемся от \"

      if (!value.equalsIgnoreCase("null")) {// Если значение не равно null
        if(flag==false)
          res.append(" AND ");
        res.append(key).append("=").append(value);
        flag = false; // После первого вхождения меняется на false, и перед следующим входжением добавляется AND
      }  
    }

    String sql = "SELECT * FROM students WHERE " + res.toString();
    System.out.println(sql);    
  } 
}
