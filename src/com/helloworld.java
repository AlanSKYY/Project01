package com;

import java.util.ArrayList;

public class helloworld {

//    public static void main(String[] args){
//        System.out.println("Hello world!");
//    }

//    ArrayList list = new ArrayList();
//    ArrayList list = new ArrayList();
//
//    ArrayList list = new ArrayList();

//    实用快捷键:
//
//    Ctrl+/ 或 Ctrl+Shift+/ 注释（// 或者/*...*/ ）
//    Ctrl+D 复制行
//    Ctrl+X 删除行
//    快速修复 alt+enter(modify/cast)
//    代码提示 alt+/
//    ctr+G 定位某一行
//    Shift+F6 重构-重命名 IDEA 批量修改变量名 点击变量名后按shift+F6
//    Ctrl+R 替换文本
//    Ctrl+F 查找文本
//
//    代码处F2 快速定位编译出错位置
//
//
//    Ctrl+E 最近打开的文件
//    Ctrl+J 自动代码
//
//    Ctrl+ home/end 抵达文件头部,底部
//
//    组织导入 ctr+alt+O
//    格式化代码 ctr+alt+L
//    大小写转化 ctr+shift+U
//
// 
//
//        --------------------------
//
//    IntelliJ Idea 常用快捷键列表
//
// 
//
//    Alt+回车导入包,自动修正
//    Ctrl+N   查找类
//    Ctrl+Shift+N 查找文件
//    Ctrl+Alt+L  格式化代码
//
//    Ctrl+Alt+O 优化导入的类和包
//    Alt+Insert 生成代码(如get,set方法,构造函数等)
//    Ctrl+E或者Alt+Shift+C  最近更改的代码
//    Ctrl+R 替换文本
//
//    Ctrl+F 查找文本
//    Ctrl+Shift+Space 自动补全代码
//    Ctrl+空格代码提示
//
//    Ctrl+Alt+Space 类名或接口名提示
//
//    Ctrl+P 方法参数提示
//
//    Ctrl+Shift+Alt+N 查找类中的方法或变量
//
//    Alt+Shift+C 对比最近修改的代码
//
// 
//
//    Shift+F6  重构-重命名
//    Ctrl+Shift+先上键
//    Ctrl+X 删除行
//    Ctrl+D 复制行
//    Ctrl+/ 或 Ctrl+Shift+/  注释（// 或者/*...*/ ）
//    Ctrl+J  自动代码
//    Ctrl+E 最近打开的文件
//
//    Ctrl+H 显示类结构图
//
//    Ctrl+Q 显示注释文档
//    Alt+F1 查找代码所在位置
//    Alt+1 快速打开或隐藏工程面板
//
//    Ctrl+Alt+left/right 返回至上次浏览的位置
//    Alt+ left/right 切换代码视图
//
//    Alt+ Up/Down 在方法间快速移动定位
//
//    Ctrl+Shift+Up/Down代码向上/下移动。
//
//    F2 或Shift+F2 高亮错误或警告快速定位
//
// 
//
//    代码标签输入完成后，按Tab，生成代码。
//
//    选中文本，按Ctrl+Shift+F7 ，高亮显示所有该文本，按Esc高亮消失。
//
//    Ctrl+W 选中代码，连续按会有其他效果
//
//    选中文本，按Alt+F3 ，逐个往下查找相同文本，并高亮显示。
//
//    Ctrl+Up/Down 光标跳转到第一行或最后一行下
//
//    Ctrl+B 快速打开光标处的类或方法 
//
//    Ctrl+O 查看该类可以重写哪些方法
//
//------------------------------------------------------------------------------------------------------------
//
//         
//
//         
//
//        2. 查询快捷键
//
//    CTRL+N  查找类 
//    CTRL+SHIFT+N  查找文件 
//    CTRL+SHIFT+ALT+N 查找类中的方法或变量 
//    CIRL+B   找变量的来源 
//    CTRL+ALT+B  找所有的子类 
//    CTRL+SHIFT+B  找变量的类 
//    CTRL+G   定位行 
//    CTRL+F   在当前窗口查找文本 
//    CTRL+SHIFT+F  在指定窗口查找文本 
//    CTRL+R   在当前窗口替换文本 
//    CTRL+SHIFT+R  在指定窗口替换文本 
//    ALT+SHIFT+C  查找修改的文件 
//    CTRL+E   最近打开的文件 
//    F3   向下查找关键字出现位置 
//    SHIFT+F3  向上一个关键字出现位置 
//    F4   查找变量来源 
//    CTRL+ALT+F7  选中的字符查找工程出现的地方 
//    CTRL+SHIFT+O  弹出显示查找内容
//
// 
//
//        3. 自动代码
//
//    ALT+回车  导入包,自动修正 
//    CTRL+ALT+L  格式化代码 
//    CTRL+ALT+I  自动缩进 
//    CTRL+ALT+O  优化导入的类和包 
//    ALT+INSERT  生成代码(如GET,SET方法,构造函数等) 
//    CTRL+E 最近更改的代码 
//    CTRL+SHIFT+SPACE 自动补全代码 
//    CTRL+空格  代码提示 
//    CTRL+ALT+SPACE  类名或接口名提示 
//    CTRL+P   方法参数提示 
//    CTRL+J   自动代码 
//    CTRL+ALT+T  把选中的代码放在 TRY{} IF{} ELSE{}里
//
//    CTRL+ALT+M  抽取方法
//
//4. 复制快捷方式
//
//    CTRL+D  复制行 
//    CTRL+X   剪切,删除行  
//
//             
//
//            5. 其他快捷方式
//
//    CIRL+U  大小写切换 
//    CTRL+Z   倒退 
//    CTRL+SHIFT+Z  向前 
//    CTRL+ALT+F12  资源管理器打开文件夹 
//    ALT+F1   查找文件所在目录位置 
//    SHIFT+ALT+INSERT 竖编辑模式 
//    CTRL+/   注释//   
//    CTRL+SHIFT+/  注释/*...*/ 
//    CTRL+W   选中代码，连续按会有其他效果 
//    CTRL+B   快速打开光标处的类或方法 
//    ALT+ ←/→ 切换代码视图 
//    CTRL+ALT ←/→ 返回上次编辑的位置 
//    ALT+ ↑/↓ 在方法间快速移动定位 
//    SHIFT+F6  重构-重命名 
//    CTRL+H   显示类结构图 
//    CTRL+Q   显示注释文档 
//    ALT+1   快速打开或隐藏工程面板 
//    CTRL+SHIFT+UP/DOWN 代码向上/下移动。 
//    CTRL+UP/DOWN  光标跳转到第一行或最后一行下 
//    ESC   光标返回编辑框 
//    SHIFT+ESC  光标返回编辑框,关闭无用的窗口 
//    F1   帮助千万别按,很卡! 
//    书签帮助L(操作非数字键盘的数字!!!!!!!)
//
//    Ctrl +Shift+1-9 书签定位行为1-9 或者字母,
//
//    Ctrl + 1-9 自动跳转到锁定位的书签位置
//
//    Ctrl+ F9 重新编译, 删除缓存.实时更新
//
//    Ctrl+Shift+U 大小写切换


    //模板一 ：psvm

    public static void main(String[] args) {
//        模板二： sout
        System.out.println("HELLO");
        //soutp / soutm / soutv / xxx.sout
//        System.out.println("helloworld.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);

        //模板三：fori
        String[] arr=new String[]{"TOM","JERRY","ALAN"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for(String s : arr){
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            
        }
        // list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        // ifn / inn / xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

        // prsf
        public void test(){
            
        }
        
        /**
         * 客户的id
         */
         private int id = 100;
         
         /**
          * 客户的姓名
          */
        private String name = "ALAN";



    }

//    ArrayList list = new ArrayList();


//    private static void println(String s) {
//        println("Hello world");
//    }
}
