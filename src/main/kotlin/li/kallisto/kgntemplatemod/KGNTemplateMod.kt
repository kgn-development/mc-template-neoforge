package li.kallisto.kgntemplatemod

import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.runForDist

/**
 * Main mod class.
 *
 * An example for blocks is in the `blocks` package of this mod.
 */
@Mod(KGNTemplateMod.ID)
object KGNTemplateMod {
    const val ID = "kgntemplatemod"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger(ID)

    init {
        LOGGER.log(Level.INFO, "initializing ${ID}")


        val obj = runForDist(clientTarget = {

        }, serverTarget = {

        })

        println(obj)
    }

}
