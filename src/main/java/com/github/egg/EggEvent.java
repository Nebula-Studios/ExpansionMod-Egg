package com.github.egg;

import net.nebula.api.event.EventListener;
import net.nebula.api.event.HandleEvent;
import net.nebula.api.event.client.CreateWindowEvent;

public class EggEvent implements EventListener {
    @HandleEvent
    public void egg(CreateWindowEvent event){
        Egg.api.getLogger().info("好家伙，这个窗口名字好神奇: "+event.getWindowName());
    }
}
