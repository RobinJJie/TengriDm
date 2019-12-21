# 《** ** **》项目

```text
APP端（Android）
    演示demo
    高仿喜马拉雅
```

![示意图](https://github.com/RobinJJie/TengriDm/blob/master/img/git_tgl01.gif)

* ![](https://img.shields.io/badge/version-v1.0.0-519dd9.svg)
* ![](https://img.shields.io/badge/LK-Robin-green.svg)
#### project框架示意
* AppBusLibrary   &#8195;&#8195;&#8195;&#8195;     (事件总线 暂定EventBus)
* DatabaseLibrary &#8195;&#8195;&#8195;&#8194;  (数据库 暂定greenDao)
* LangLibrary    &#8195;&#8195;&#8195;&#8195;&#8195;&#8194;    (文本语言或一些公共资源文件)
* CommonLibrary   &#8195;&#8195;&#8195;&#8195;  (基础库)

| 一级| 二级    |  三级   |
|----|----|----|
|DatabaseLibrary |||
|LangLibrary |||
|MagBusLibrary |||
||CommonLibrary||
|||AppHome|
|||AppMine|
|||AppRadio|

#### 架构文件说明
> com.qdgdcm.basecommonlib.common.BuildConfig  控制全局debug

> common_config.gradle 控制组件化 合并/拆分
