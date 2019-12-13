-dontobfuscate

-keep class com.qnips.menu.content.NutritionFacts { java.lang.String getValue(android.content.res.Resources,int,boolean); }
-whyareyoukeeping class com.qnips.menu.content.NutritionFacts { *; }

-keepattributes SourceFile,LineNumberTable
