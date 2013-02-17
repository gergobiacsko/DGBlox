package dylangore.mod.blox.client;

import net.minecraftforge.client.MinecraftForgeClient;
import dylangore.mod.blox.common.CommonProxy;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}
