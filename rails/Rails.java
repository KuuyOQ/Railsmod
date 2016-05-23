package rails;
 
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rails.Blocks.Clearrail;
import rails.Blocks.Clearrailpowered;
import rails.Blocks.Lantern;
import rails.Blocks.Onerail;
import rails.Blocks.Railblock;
import rails.Blocks.Railcamo;
import rails.Blocks.Railstop;
import rails.Recipes.Craftingrecipes;
 
@Mod(modid = Rails.MOD_ID,
        name = Rails.MOD_NAME,
        version = Rails.MOD_VERSION,
        dependencies = Rails.MOD_DEPENDENCIES,
        acceptedMinecraftVersions = Rails.MOD_ACCEPTED_MC_VERSIONS,
        useMetadata = true)

public class Rails{
    public static final String MOD_ID = "RailsMod";
    public static final String MOD_NAME = "Rails";
    public static final String MOD_VERSION = "1.0";
    public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.9-12.16.0.1853,)";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.9,1.9.4]";
    public static Block onerail;
    public static Block clearrail;
    public static Block clearrailpowered;
    public static Block railstop;
    public static Block railcamo;
    public static Block railblock;
    public static Block lantern;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        onerail = new Onerail();
        ResourceLocation registryName = new ResourceLocation(MOD_ID, "onerail");
        ItemBlock oneitemrail = new ItemBlock(onerail);
        GameRegistry.register(onerail, registryName);
        GameRegistry.register(oneitemrail, registryName);
        if(event.getSide().isClient()){
           ModelLoader.setCustomModelResourceLocation(oneitemrail, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "onerail"), "inventory"));}
            clearrail = new Clearrail();
            ResourceLocation registaryName = new ResourceLocation(MOD_ID, "clearrail");
            ItemBlock clearitemrail = new ItemBlock(clearrail);
            GameRegistry.register(clearrail, registaryName);
            GameRegistry.register(clearitemrail, registaryName);
            if(event.getSide().isClient()){
                ModelLoader.setCustomModelResourceLocation(clearitemrail, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "clearrail"), "inventory"));
            }
            clearrailpowered = new Clearrailpowered();
            ResourceLocation cpregistaryName = new ResourceLocation(MOD_ID, "clearrailpowered");
            ItemBlock clearitemrailpowered = new ItemBlock(clearrailpowered);
            GameRegistry.register(clearrailpowered, cpregistaryName);
            GameRegistry.register(clearitemrailpowered, cpregistaryName);
            if(event.getSide().isClient()){
                ModelLoader.setCustomModelResourceLocation(clearitemrailpowered, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "clearrailpowered"), "inventory"));
            }
            railstop = new Railstop();
            ResourceLocation cpregistarayName = new ResourceLocation(MOD_ID, "railstop");
            ItemBlock railitemstop = new ItemBlock(railstop);
            GameRegistry.register(railstop, cpregistarayName);
            GameRegistry.register(railitemstop, cpregistarayName);
            if(event.getSide().isClient()){
                ModelLoader.setCustomModelResourceLocation(railitemstop, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "railstop"), "inventory"));
            }
            railcamo = new Railcamo();
            ResourceLocation cpregistarayaName = new ResourceLocation(MOD_ID, "railcamo");
            ItemBlock railitemcamo = new ItemBlock(railcamo);
            GameRegistry.register(railcamo, cpregistarayaName);
            GameRegistry.register(railitemcamo, cpregistarayaName);
            if(event.getSide().isClient()){
                ModelLoader.setCustomModelResourceLocation(railitemcamo, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "railcamo"), "inventory"));
            }
            railblock = new Railblock();
            ResourceLocation cpregistarayaaName = new ResourceLocation(MOD_ID, "railblock");
            ItemBlock railitemblock = new ItemBlock(railblock);
            GameRegistry.register(railblock, cpregistarayaaName);
            GameRegistry.register(railitemblock, cpregistarayaaName);
            if(event.getSide().isClient()){
                ModelLoader.setCustomModelResourceLocation(railitemblock, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "railblock"), "inventory"));
            }
            lantern = new Lantern();
            ResourceLocation cpregistarayaaaName = new ResourceLocation(MOD_ID, "lantern");
            ItemBlock lanternitem = new ItemBlock(lantern);
            GameRegistry.register(lantern, cpregistarayaaaName);
            GameRegistry.register(lanternitem, cpregistarayaaaName);
            if(event.getSide().isClient()){
                ModelLoader.setCustomModelResourceLocation(lanternitem, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "lantern"), "inventory"));
            }
            Craftingrecipes.registerRecipe();
            
    }
    
    
}