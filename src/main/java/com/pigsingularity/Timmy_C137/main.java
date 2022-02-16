package com.pigsingularity.Timmy_C137;

import com.pigsingularity.Timmy_C137.proxy.CommonProxy;
import com.pigsingularity.Timmy_C137.util.Handlers.RegistryHandler;
import com.pigsingularity.Timmy_C137.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class main
{
    @Mod.Instance
    public static main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void preinit(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void preinit(FMLPostInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void serverInit(FMLServerStartingEvent event)
    {

    }
}
