关于eclipse工程
主要问题如下：
1.eclipse  android 环境搭建，已解决
具体过程见，eclipse文件夹下的android环境搭建
2.eclipse和android SDK的java complier版本不匹配，已解决
右键项目->android tools->fix project properties之后会自动改变项目的
java complier版本，但是windows->preference里是eclipse默认版本，二者
不同
问题症结，built-tools版本低，无法编译库中的依赖；版本太高，无法载入dx.jar
我是智障，之前曾导入了一个android studio里的jar包，这玩意是jdk8才能编译
的，但eclipse里的只有jdk6，为了与android的jdk匹配还不能换

接下来是虚拟机问题，待续.....
在eclipse里新建了一个API29的虚拟机，但没有运行成功，报错
ERROR: This AVD's configuration is missing a kernel file! Please ensure the 
file "kernel-qemu" is in the same location as your system image.
意思很明确，没找到kernel-qemu文件，手动去找了一下，确实没有，为什么呢？
推测是因为文件已经改名成kernrl-ranchu了
嗯......确实是这样，低版本的虚拟机里的就没改名，以后高版本还是android studio
用吧，说不定是因为我用的是jdk16所以只会找kernel-qemu，话说我这是下了几
个jdk啊！！！

虚拟机创建成功，项目运行成功，需要注意的是，服务器项目要用jdk18运行，
客户端用jdk16运行，额......这么做的主要原因是android SDK的某些东西需要
用16编译


