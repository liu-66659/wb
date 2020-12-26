package yuki.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 余弦相似度计算工具类
 *
 */

public class GetSimiarityUtil {

    Map<String, int[]> vectorMap = new HashMap<String, int[]>();

    int[] tempArray = null;


    /**
     * 构造器 在这里面分词
     * @param str1 文本1
     * @param str2 文本2
     */
    public  GetSimiarityUtil(String str1,String str2) {

        ArrayList<String> list1 = new ArrayList<>();
        for (String s : JieBaUtil.startParticiple(str1)) {
            //用结巴分词把他们分开，在遍历，把他们当成，map的key,如何之前有这个key,
            // 那个数组（ vectorMap.get(s2)）[1]是得到下标为1的值，并把值相加
            //else建立数组，由于第一次出现，要付值为1，

            if (vectorMap.containsKey(s)) {//该方法判断Map集合对象中是否包含指定的键名。如果Map集合中包含指定的键名，则返回true，否则
                vectorMap.get(s)[0]++;
            } else {
                tempArray = new int[2];
                tempArray[0] = 1;
                tempArray[1] = 0;
                vectorMap.put(s, tempArray);//把字符串和数组放到map中
            }

        }
        for (String s2 : JieBaUtil.startParticiple(str2)) {

            if (vectorMap.containsKey(s2)) {
                vectorMap.get(s2)[1]++;
            } else {
                tempArray = new int[2];
                tempArray[0] = 0;
                tempArray[1] = 1;
                vectorMap.put(s2, tempArray);
            }
        }

        //测试输出文本1和文本2分词和词频的结果;
        //文本1的分词和词频;
        System.out.println("文本1的分词和词频**********************：");
        for(String f1:vectorMap.keySet())
        {
            System.out.println("分词："+f1+"<--->"+"词频："+vectorMap.get(f1)[0]);
        }
        //文本2;
        System.out.println("文本2的分词和词频**********************：");
        for(String f2:vectorMap.keySet())
        {
            System.out.println("分词："+f2+"<--->"+"词频："+vectorMap.get(f2)[1]);
        }


        System.out.println();
        System.out.print("文本1词频的空间向量：[");
        for(String f1:vectorMap.keySet())
        {
            System.out.print(vectorMap.get(f1)[0]+",");
        }
        System.out.print("];");

        System.out.println();
        System.out.print("文本2词频的空间向量：[");
        for(String f1:vectorMap.keySet())///map的key不为空，
        {
            System.out.print(vectorMap.get(f1)[1]+",");
        }
        System.out.print("];");
        System.out.println();

    }

    /**
     *  求平方和
     * @param paramMap 键值对，记录词组的数量
     * @return 返回词组平方和
     */
    private double squares(Map<String, int[]> paramMap) {
        double result1 = 0;
        double result2 = 0;
        Set<String> keySet = paramMap.keySet();//把map中的key存入到集合中，，，，，，Set 接口中元素无序，并且都会以某种规则保证存入的元素不出现重复。

        for (String character : keySet) {//对集合进行遍历
            int temp[] = paramMap.get(character);///这个是map由key得到value值，并放到数组中
          ///System.out.println("这个是把分词的个数说出来"+temp[0]);
            result1 += (temp[0] * temp[0]);///应为文本一的分词出现的次数都放到了下标为0的数组中，所有要temp[0] * temp[0]，在加
            result2 += (temp[1] * temp[1]);

        }

        //测试输出;
        System.out.println("文本1词频的平方和：");
        for (String character : keySet) {
            int temp[] = paramMap.get(character);
            System.out.print(temp[0]+"*"+temp[0]+"+");
        }
        System.out.println();
        System.out.println("文本1词频的平方和："+result1);
        System.out.println("文本2词频的平方和：");
        for (String character : keySet) {
            int temp[] = paramMap.get(character);
            System.out.print(temp[1]+"*"+temp[1]+"+");
        }
        System.out.println();
        System.out.println("文本2词频的平方和："+result2);
        return result1 * result2;
    }
    //平方相加
    private double sqrtMulti(Map<String, int[]> paramMap) {
        double result = 0;
        result = squares(paramMap);//由上面的方法得到平方和
        result = Math.sqrt(result);
        System.out.println("sqrt(result1*resul2):"+result);
        return result;
    }

    // 点乘法
    private double pointMulti(Map<String, int[]> paramMap) {
        double result = 0;
        System.out.println("计算文本1和文本2空间向量的乘积和:");
        Set<String> keySet = paramMap.keySet();
        for (String character : keySet) {
            int temp[] = paramMap.get(character);
            result += (temp[0] * temp[1]);
            System.out.print(temp[0]+"*"+temp[1]+"+");
        }
        System.out.println();
        System.out.print("文本1和文本2空间向量的乘积和为sum："+result);
        System.out.println();
        return result;
    }
    // 求余弦相似度
    public double sim() {
        double result = 0;
        result = pointMulti(vectorMap) / sqrtMulti(vectorMap);
        //点乘法/平方相加
        System.out.println("所得结果result=" +result);
        return result;
    }




}
