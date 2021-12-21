# 1. switch 支持类型

只支持byte,short,char,int,enum,String不支持long等其他

# 2. short s1 = 1;



# 3. /**wendan*/



# 4. &和&&区别

A&B A为false B依旧执行

A&&B A为false B就不执行了

```
i++ 先运算再加,++i
i = 1
int m = i++ + 2; // m = 3
int n = ++i + 2; // m = 4
```

& 还可以表示位运算，先转出二进制，再计算

```
1&3
```



# 5. final

以Math类为例

final修饰的类不可以被继承

final修饰的变量不可变，是指不可以改变引用，可以改变内容

final修饰的函数不能被重写



# 6. break;continue;return;



# 7. 结束多重循环

加标签

```
ok: for () {
	for () {
		if () {
			break ok;
		}
	}
}
```



# 8. java 面向对象特性

封装：提高对象安全性

继承：提高对象复用性

多态：提高对象扩展性；注意多态的话使用起来可能还不够使得代码最简洁，还得判断类型，最好的情况是使用反射；

