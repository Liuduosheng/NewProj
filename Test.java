public class Test {

    /*
    * 姐姐今年13岁，弟弟今年9岁，当姐弟俩岁数之和是40岁时，两个人各是多少岁？
    * */

    public static void main(String[] args) {
        int sister = 13;
        int brother = 9;
        for (;sister <= 40 && brother <= 40;sister++,brother++){
                if(sister + brother == 40 && sister - brother == 4){
                    System.out.println("sister=" +sister + ",brother=" + brother);
                }
        }
    }
}
