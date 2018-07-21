package com.wcc.nio2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * 观察C盘的文件变化
 */
public class WatchDemo {

    /**
     * 1、创建观察服务
     * 2、注册目录到观察服务上
     * 3、从观察服务队列中获取WatchKey
     * 4、处理发生在已注册目录中的事件
     * 5、处理完成事件后重置WatchKey
     * 6、关闭观察服务
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        WatchService ws = FileSystems.getDefault().newWatchService();
        Path paths = Paths.get("C:");
        //注册需要观察的事件
        WatchKey watchKey = paths.register(ws, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY,
                StandardWatchEventKinds.ENTRY_DELETE);

        while (true) {
            //从队列里得到WatchKey
            WatchKey wk = ws.take();
            for (WatchEvent<?> e : wk.pollEvents()) {
                WatchEvent.Kind kind = e.kind();
                if (kind == StandardWatchEventKinds.OVERFLOW) {
                    //如果当前事件是异常事件，则跳过
                    continue;
                }
                WatchEvent<Path> currEvent = (WatchEvent<Path>) e;
                Path path = currEvent.context();
                System.out.println(path + "发生" + kind);
            }
            wk.reset();
        }
//        ws.close();


    }
}
