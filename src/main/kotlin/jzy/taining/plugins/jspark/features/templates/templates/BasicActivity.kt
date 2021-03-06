package jzy.taining.plugins.jspark.features.templates.templates

import jzy.taining.plugins.jspark.features.templates.data.TemplateValues

fun jsparkActivity(templateValues: TemplateValues) =
    """
package ${templateValues.packageName}

import com.heytap.sporthealth.blib.basic.ui.BasicActivity
import com.heytap.sporthealth.blib.basic.config
import com.heytap.sporthealth.blib.basic.emptlayout
import com.heytap.sporthealth.blib.basic.errlayout
import com.heytap.sporthealth.blib.basic.state
import ${templateValues.fullViewBeanName}
import ${templateValues.fullViewModelName}
import ${templateValues.applicationId}.R
import android.os.Bundle

/**
 *  generated by jspark
 */
class ${templateValues.activityName} : BasicActivity<${templateValues.viewModelName}, ${templateValues.viewBeanName}>() {
    
    override fun setContentLayout() = R.layout.${templateValues.activityLayoutName}
    
    override fun initView() {
//      示例: DSL修改 默认的加载失败布局和加载数据为空的布局
//      config {
//          errlayout = R.layout.act_busi_jspark
//          emptlayout = R.layout.act_busi_jspark
//      }
        TODO("这里查找所有控件")
    }
    
    override fun provideViewModel() = ${templateValues.viewModelName}::class.java
    
    override fun showSucceed(result: ${templateValues.viewBeanName}?) {
        super.showSucceed(result)
        TODO("业务逻辑加载到数据之后执行，使用result填充界面控件")
    }
    
}
    """