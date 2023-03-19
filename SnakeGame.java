class Map{
    final int row = 20;
    final int column = 30;
    String[][] map = new String[row][column];

    public int getRow(){ return row; }
    public int getColumn(){ return column; }

    public Map(){
        for(int i = 0; i < row; i++){
            for(int k =0; k < column; k++){
                if(i == 0 || i == row - 1  || k == 0 || k == column - 1)
                    map[i][k] = "x";
                else{
                    if(map[i][k] != "f")
                        map[i][k] = " ";
                }
            }
        }
    }
    public void init(){
        for(int i = 0; i < row; i++){
            for(int k =0; k < column; k++){
                System.out.printf("%s", map[i][k]);
            }
            System.out.printf("%n");
        }
    }
    public void generateFood(){
        int foodx = (int)(Math.random() * (row-2)+1);
        int foody = (int)(Math.random() * (column-2)+1);
        System.out.println(foodx + " " + foody);
        map[foodx][foody] = "f";
    }

}
//linked list로 구현하기
class Snake{
    int x;
    int y;
    int length;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void grow(){
        length++;
    }
    public void eat(){
        
    }
    public void hit(){

    }
}

public class SnakeGame {
    //map-thread
    //key-thread
    //snake-thread
    public static void main(String[] args){
        Snake snake = new Snake();
        Map map = new Map();
        map.generateFood();
        map.init();
    }
}
