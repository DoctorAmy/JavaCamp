public class RefAndNull {
    public static void main(String[] args) {
        Products [] myProducts = new Products[10];
        for (int i = 0; i < myProducts.length; i++) {
            if(i%2 == 0) {
                myProducts[i] = new Products();
            }
        }
        // 引用缺省值null
        // 代表空,不存在,可以读空
        // 数组创建出来的引用类型,默认值都是null

        /*
            myProducts = Products@4f3f5b24
            myProducts = null
            myProducts = Products@15aeb7ab
            myProducts = null
            myProducts = Products@7b23ec81
            myProducts = null
            myProducts = Products@6acbcfc0
            myProducts = null
            myProducts = Products@5f184fc6
            myProducts = null
        */
        for (int i = 0; i < myProducts.length; i++) {
            System.out.println("myProducts = " + myProducts[i]);
        }

        // 打印对
        /*
            myProducts[name] = null
            myProducts[price] = null
            myProducts[id] = 0
            myProducts[category] = null
        */
        for (int i = 0; i < myProducts.length; i++) {
            if (i%2 == 0) {
                Products item = myProducts[i];
                System.out.println("myProducts[name] = " +item.name);
                System.out.println("myProducts[price] = " +item.price);
                System.out.println("myProducts[id] = " +item.id);
                System.out.println("myProducts[category] = " +item.category);
            }
        }

        // null带来的问题:NullPointerException NPE
        // Exception in thread "main" java.lang.NullPointerException:
        // Cannot assign field "name" because "myProducts[5]" is null at RefAndNull.main(RefAndNull.java:47)
        // myProducts[5].name = "电视机";


        // null带来的问题:NullPointerException NPE(需要判空 obj != null)
        for (int i = 0; i < myProducts.length; i++) {
            if (myProducts[i] != null) {
                myProducts[i].name = "商品" + i;
            }
        }
        for (int i = 0; i < myProducts.length; i++) {
            if (myProducts[i] != null) {
                System.out.println("myProducts = " + myProducts[i].name);
            }
        }

    }
}


