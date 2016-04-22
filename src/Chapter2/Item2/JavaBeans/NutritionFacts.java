package Chapter2.Item2.JavaBeans;

// JavaBeans Pattern - allows inconsistency, mandates mutability - Pages 12-13
/**
 * javabeans模式
 * 不足：因为构造的过程分割成好多步骤（如：多次set）。在构造过程中javabean可能处于不一致的状态（个人的理解写在main方法中，不知道对不对？）。
 *	        这种模式肯定不能做成不可变类，要不然怎么new和set
 */
public class NutritionFacts {
    // Parameters initialized to default values (if any)
    private int servingSize  = -1;  // Required; no default value
    private int servings     = -1;  //     "     "     "      "
    private int calories     = 0;
    private int fat          = 0;
    private int sodium       = 0;
    private int carbohydrate = 0;

    public NutritionFacts() { }

    // Setters
    public void setServingSize(int val)  { servingSize = val; }
    public void setServings(int val)     { servings = val; }
    public void setCalories(int val)     { calories = val; }
    public void setFat(int val)          { fat = val; }
    public void setSodium(int val)       { sodium = val; }
    public void setCarbohydrate(int val) { carbohydrate = val; }


    public static void main(String[] args) {
    	/**
    	 * 在构造过程中javabean可能处于不一致的状态
    	 * 个人理解：new了NutritionFacts类的两个实例，set的属性不一样，这两个实例不一致，
    	 * 		  你不能保证通过该类的同一个构造器保证构造出来的对象是属性相同的
    	 */
        NutritionFacts cocaCola1 = new NutritionFacts();
        cocaCola1.setServingSize(240);
        cocaCola1.setServings(8);
        cocaCola1.setCalories(100);
        cocaCola1.setSodium(35);
        cocaCola1.setCarbohydrate(27);
        NutritionFacts cocaCola2 = new NutritionFacts();
        cocaCola2.setServingSize(240);
        cocaCola2.setServings(8);
        
    }
}