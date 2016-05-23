package rails.Blocks;

import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Railstop extends BlockPumpkin {
	public Railstop() {
		func_149647_a(CreativeTabs.field_78029_e);
		func_149663_c("railstop");
	}
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer func_180664_k()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public boolean func_149686_d(IBlockState state)
    {
        return false;
    }
    
    public boolean func_149662_c(IBlockState state)
    {
        return false;
    }
}