package com.lara.Map;

import java.util.Properties;
import java.util.Set;
public class M30 
{
	public static void main(String[] args) 
	{
		Properties pr = System.getProperties();
		Set set = pr.keySet();
		for(Object obj:set)
		{
			System.out.println(obj+":"+pr.getProperty((String)obj));
		}
	}
}
/*
java.runtime.name:Java(TM) SE Runtime Environment
sun.boot.library.path:C:\Program Files\Java\jre1.8.0_121\bin
java.vm.version:25.121-b13
java.vm.vendor:Oracle Corporation
java.vendor.url:http://java.oracle.com/
path.separator:;
java.vm.name:Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg:sun.io
user.country:US
user.script:
sun.java.launcher:SUN_STANDARD
sun.os.patch.level:Service Pack 1
java.vm.specification.name:Java Virtual Machine Specification
user.dir:C:\Users\Bipin\workspace\Collection
java.runtime.version:1.8.0_121-b13
java.awt.graphicsenv:sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs:C:\Program Files\Java\jre1.8.0_121\lib\endorsed
os.arch:amd64
java.io.tmpdir:C:\Users\Bipin\AppData\Local\Temp\
line.separator:

java.vm.specification.vendor:Oracle Corporation
user.variant:
os.name:Windows 7
sun.jnu.encoding:Cp1252
java.library.path:C:\Program Files\Java\jre1.8.0_121\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;
C:\Windows;C:/Program Files/Java/jre1.8.0_121/bin/server;C:/Program Files/Java/jre1.8.0_121/bin;
C:/Program Files/Java/jre1.8.0_121/lib/amd64;F:\oraclexe\app\oracle\product\11.2.0\server\bin;;
C:\ProgramData\Oracle\Java\javapath;E:\newbatch\app2\;C:\Program Files (x86)\Java\jdk1.8.0_111/bin;
C:\Program Files (x86)\Apache Software Foundation\Tomcat 8.0/bin;;F:\Lara Drive\eclipse2\eclipse;;.
java.specification.name:Java Platform API Specification
java.class.version:52.0
sun.management.compiler:HotSpot 64-Bit Tiered Compilers
os.version:6.1
user.home:C:\Users\Bipin
user.timezone:
java.awt.printerjob:sun.awt.windows.WPrinterJob
file.encoding:Cp1252
java.specification.version:1.8
java.class.path:C:\Users\Bipin\workspace\Collection\bin
user.name:Bipin
java.vm.specification.version:1.8
sun.java.command:com.lara.Map.M30
java.home:C:\Program Files\Java\jre1.8.0_121
sun.arch.data.model:64
user.language:en
java.specification.vendor:Oracle Corporation
awt.toolkit:sun.awt.windows.WToolkit
java.vm.info:mixed mode
java.version:1.8.0_121
java.ext.dirs:C:\Program Files\Java\jre1.8.0_121\lib\ext;C:\Windows\Sun\Java\lib\ext
sun.boot.class.path:C:\Program Files\Java\jre1.8.0_121\lib\resources.jar;C:\Program Files\Java\jre1.8.0_121\lib\rt.jar;C:\Program Files\Java\jre1.8.0_121\lib\sunrsasign.jar;C:\Program Files\Java\jre1.8.0_121\lib\jsse.jar;C:\Program Files\Java\jre1.8.0_121\lib\jce.jar;C:\Program Files\Java\jre1.8.0_121\lib\charsets.jar;C:\Program Files\Java\jre1.8.0_121\lib\jfr.jar;C:\Program Files\Java\jre1.8.0_121\classes
java.vendor:Oracle Corporation
file.separator:\
java.vendor.url.bug:http://bugreport.sun.com/bugreport/
sun.io.unicode.encoding:UnicodeLittle
sun.cpu.endian:little
sun.desktop:windows
sun.cpu.isalist:amd64

*/