## Android-UtilsLibrary

	Android开发辅助工具类Library，用于快速开发，以便减少做重复的工作，提高开发效率。
	本项目为 Android Library 工程，如需引用请下载拷贝到Project目录下，并添加Gradle依赖。

## Gradle

	compile project(':UtilsLibrary')

## 包含的工具类

	1.AppUtils
		获取应用程序名称
		获取应用程序版本名称信息
		
	2.CameraUtils
		判断摄像头是否可用
	
	3.DensityUtils
		根据手机的分辨率从 dip 的单位 转成为 px(像素)
		根据手机的分辨率从 px(像素) 的单位 转成为 dp
		
	4.FileUtils
		检查是否存在SD卡
		创建目录
		删除文件（若为目录，则递归删除子目录和文件）
		获取文件大小，单位为byte（若为目录，则包括所有子目录和文件）
		保存Bitmap到指定目录
		判断某目录下文件是否存在
	
	5.HttpUtils（HttpURLConnection）
		异步的Get请求
		异步的Post请求
	
	6.KeyBoardUtils
		切换软键盘的状态，如当前为收起变为弹出,若当前为弹出变为收起
		强制隐藏输入法键盘
		强制显示输入法键盘
		输入法是否显示
	
	7.LogUtils
		调试打印Log
	
	8.NetUtils
		判断网络是否连接
		是否有网络，需要加上访问网络状态的权限
		判断是否是WiFi网络
		打开网络设置界面
	
	9.ScreenUtils
		获得屏幕高度
		获得屏幕宽度
		获得状态栏的高度
		获取当前屏幕截图，包含状态栏
		获取当前屏幕截图，不包含状态栏
	
	10.SDCardUtils
		判断SDCard是否可用
		获取SD卡路径
		获取SD卡的剩余容量(byte)
		获取指定路径所在空间的剩余可用容量字节数(byte)
		获取系统存储路径
	
	11.SPUtils
		保存数据的方法（put方法），根据类型调用不同的保存方法
		获取数据的方法（get方法），根据默认值得到数据的类型，然后调用对应方法获取值
		移除某个key对应的值
		清除所有数据
		查询某个key是否已经存在
		返回所有的键值对
		
	12.ToastUtils
		短时间显示Toast
		长时间显示Toast
	
	13.ViewUtils
		把自身从父View中移除
		判断触点是否落在该View上

Android-UtilsLibrary除了以上常用工具类，还提供了对一些常用开源框架的辅助工具类，如下：
	
## 开源框架的辅助工具类

	1.GlideUtils(Glide)：
		Glide加载图片的时根据图片尺寸让ImageView自适应
	
	2.GsonUtils(Gson)：
		把一个map变成json字符串
		把一个json字符串变成对象
		把json字符串变成map
		把json字符串变成集合
		获取json串中某个字段的值，注意，只能获取同一层级的value

## License
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
