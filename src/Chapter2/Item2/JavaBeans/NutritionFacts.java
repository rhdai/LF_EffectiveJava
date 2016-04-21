package Chapter2.Item2.JavaBeans;

// JavaBeans Pattern - allows inconsistency, mandates mutability - Pages 12-13
/**
 * javabeansģʽ
 * ���㣺��Ϊ����Ĺ��̷ָ�ɺöಽ�裨�磺���set�����ڹ��������javabean���ܴ��ڲ�һ�µ�״̬�����˵����д��main�����У���֪���Բ��ԣ�����
 *	        ����ģʽ�϶��������ɲ��ɱ��࣬Ҫ��Ȼ��ônew��set
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
    	 * �ڹ��������javabean���ܴ��ڲ�һ�µ�״̬
    	 * ������⣺new��NutritionFacts�������ʵ����set�����Բ�һ����������ʵ����һ�£�
    	 * 		  �㲻�ܱ�֤ͨ�������ͬһ����������֤��������Ķ�����������ͬ��
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