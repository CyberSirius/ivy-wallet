package com.ivy.core.data

import com.ivy.core.data.common.ItemIconId
import com.ivy.core.data.common.IvyColor
import com.ivy.core.data.common.Reorderable
import com.ivy.core.data.common.Value
import java.util.*

data class Budget(
    val id: UUID,
    val name: String,
    val description: String?,
    val iconId: ItemIconId,
    val color: IvyColor,
    val amount: Value,
    val carryOver: Boolean,
    val period: TimePeriod,
    val categories: List<CategoryId>,
    override val orderNum: Double
) : Reorderable

@JvmInline
value class BudgetId(val id: UUID)
