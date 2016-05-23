package rails.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Lantern extends Block {
	protected static final AxisAlignedBB lantern = new AxisAlignedBB(6.0D, 15.0D, 6.0D, 10.0D, 16.0D, 10.0D);
	public Lantern() {
		super(Material.field_151592_s);
		func_149647_a(CreativeTabs.field_78031_c);
		func_149663_c("lantern");
		func_149713_g(1);
        func_149715_a(1.0F);
	}
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer func_180664_k()
    {
    	
    	
        return BlockRenderLayer.CUTOUT;
    }
   
    public AxisAlignedBB func_180640_a(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return lantern;
    }

    public boolean func_149686_d(IBlockState state)
    {
        return false;
    }
    
    public boolean func_149662_c(IBlockState state)
    {
        return false;
    }
    public AxisAlignedBB func_180646_a(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return null;
    }
  
}