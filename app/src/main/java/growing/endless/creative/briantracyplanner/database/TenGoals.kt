package growing.endless.creative.briantracyplanner.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 *
 * @author Jonathan Alexander Norberg
 * @version 12/05/2019
 */
@Entity

data class TenGoals(

    var one: String = "",
    var two: String = "",
    var three: String = "",
    var four: String = "",
    var five: String = "",
    var six: String = "",
    var seven: String = "",
    var eigth: String = "",
    var nine: String = "",
    var ten: String = ""

) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}