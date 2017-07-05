package aop;

import javassist.*;

import java.io.IOException;

/**
 * Created by corly on 2017/1/6.
 */
public class Crack {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {
        ClassPool classPool= ClassPool.getDefault();
        classPool.insertClassPath("G:\\charles.jar"); //复制出来charles.jar的文件路径

        CtClass ctClass = classPool.get("com.xk72.charles.License");
        CtMethod ctMethod =ctClass.getDeclaredMethod("a",null);
        ctMethod.setBody("{return true;}");
        ctMethod = ctClass.getDeclaredMethod("b",null);
        ctMethod.setBody("{return \"Regisered Name\";}");
        ctClass.writeFile("G:\\");
    }
}
