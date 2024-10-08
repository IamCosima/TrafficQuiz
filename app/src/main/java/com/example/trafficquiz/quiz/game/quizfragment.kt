package com.example.trafficquiz.quiz.game

import android.content.ContentValues
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.trafficquiz.R
import com.example.trafficquiz.databinding.FragmentQuizBinding
import com.example.trafficquiz.quiz.game.model.QuestionModel
import com.example.trafficquiz.quiz.game.model.Questions
import com.example.trafficquiz.quiz.game.model.dbmodel


class quizfragment : Fragment(), View.OnClickListener {
    lateinit var binding: FragmentQuizBinding
    private val args: quizfragmentArgs by navArgs()

    //Vars for Questionlists
    lateinit var RoadSign: ArrayList<QuestionModel>
    lateinit var RoadRule: ArrayList<QuestionModel>
    lateinit var RoadMark: ArrayList<QuestionModel>
    lateinit var Signal: ArrayList<QuestionModel>
    lateinit var VehicleControls: ArrayList<QuestionModel>
    lateinit var WrongList: List<dbmodel>
    private var cursor: Int = 0
    private var NumCorrect: Int = 0
    private var Numwrong: Int = 0
    private var QuestionAns: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_quiz, container, false)

        binding.textViewOptionOne.setOnClickListener(this)
        binding.textViewOptionTwo.setOnClickListener(this)
        binding.textViewOptionThree.setOnClickListener(this)
        binding.textViewOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)

        RoadSign = Questions.Sample_Road_Sign()
        RoadRule = Questions.Sample_Road_Rules()
        RoadMark = Questions.Sample_Road_Markings()
        Signal = Questions.Sample_Signals()
        VehicleControls = Questions.Sample_Vehicle_Controls()
        var helper = WrongDB(requireContext())
        WrongList = helper.getallWrong()

        val type = args.QuizType

        if (type == 1) {
            setRoadSign()
        } else if (type == 2) {
            setRoadMark()

        } else if (type == 3) {
            setSignal()

        } else if (type == 4) {
            setRoadRule()

        } else if (type == 5) {
            setVehicleControl()

        } else if (type == 6) {
            setWrong()

        }
        return binding.root
    }

    private fun setVehicleControl() {
        val list = VehicleControls[cursor]
        val max = VehicleControls.size

        val Question = list.Question
        val image = list.Image
        val Option_1 = list.Option_1
        val Option_2 = list.Option_2
        val Option_3 = list.Option_3
        val Option_4 = list.Option_4
        val Correct_option = list.Correct_option

        //text view changes
        binding.textViewQuestion.text = Question
        binding.textViewOptionOne.text = Option_1
        binding.textViewOptionTwo.text = Option_2
        binding.textViewOptionThree.text = Option_3
        binding.textViewOptionFour.text = Option_4
        binding.textViewNumberProgress.text = (cursor + 1).toString() + "/" + max.toString()

        //Imageview
        binding.imageViewQuestion.setImageResource(image)

        //Progressbar changes
        binding.mainProgressbar.progress = cursor + 1
        binding.mainProgressbar.max = max
    }

    private fun setSignal() {
        val list = Signal[cursor]
        val max = Signal.size

        val Question = list.Question
        val image = list.Image
        val Option_1 = list.Option_1
        val Option_2 = list.Option_2
        val Option_3 = list.Option_3
        val Option_4 = list.Option_4
        val Correct_option = list.Correct_option

        //text view changes
        binding.textViewQuestion.text = Question
        binding.textViewOptionOne.text = Option_1
        binding.textViewOptionTwo.text = Option_2
        binding.textViewOptionThree.text = Option_3
        binding.textViewOptionFour.text = Option_4
        binding.textViewNumberProgress.text = (cursor + 1).toString() + "/" + max.toString()

        //Imageview
        binding.imageViewQuestion.setImageResource(image)

        //Progressbar changes
        binding.mainProgressbar.progress = cursor + 1
        binding.mainProgressbar.max = max
    }

    private fun setRoadMark() {
        val list = RoadMark[cursor]
        val max = RoadMark.size

        val Question = list.Question
        val image = list.Image
        val Option_1 = list.Option_1
        val Option_2 = list.Option_2
        val Option_3 = list.Option_3
        val Option_4 = list.Option_4
        val Correct_option = list.Correct_option

        //text view changes
        binding.textViewQuestion.text = Question
        binding.textViewOptionOne.text = Option_1
        binding.textViewOptionTwo.text = Option_2
        binding.textViewOptionThree.text = Option_3
        binding.textViewOptionFour.text = Option_4
        binding.textViewNumberProgress.text = (cursor + 1).toString() + "/" + max.toString()

        //Imageview
        binding.imageViewQuestion.setImageResource(image)

        //Progressbar changes
        binding.mainProgressbar.progress = cursor + 1
        binding.mainProgressbar.max = max
    }

    private fun setRoadRule() {
        val list = RoadRule[cursor]
        val max = RoadRule.size

        val Question = list.Question
        val image = list.Image
        val Option_1 = list.Option_1
        val Option_2 = list.Option_2
        val Option_3 = list.Option_3
        val Option_4 = list.Option_4
        val Correct_option = list.Correct_option

        //text view changes
        binding.textViewQuestion.text = Question
        binding.textViewOptionOne.text = Option_1
        binding.textViewOptionTwo.text = Option_2
        binding.textViewOptionThree.text = Option_3
        binding.textViewOptionFour.text = Option_4
        binding.textViewNumberProgress.text = (cursor + 1).toString() + "/" + max.toString()

        //Imageview
        binding.imageViewQuestion.setImageResource(image)

        //Progressbar changes
        binding.mainProgressbar.progress = cursor + 1
        binding.mainProgressbar.max = max
    }

    private fun setRoadSign() {

        val list = RoadSign[cursor]
        val max = RoadSign.size

        val Question = list.Question
        val image = list.Image
        val Option_1 = list.Option_1
        val Option_2 = list.Option_2
        val Option_3 = list.Option_3
        val Option_4 = list.Option_4
        val Correct_option = list.Correct_option

        //text view changes
        binding.textViewQuestion.text = Question
        binding.textViewOptionOne.text = Option_1
        binding.textViewOptionTwo.text = Option_2
        binding.textViewOptionThree.text = Option_3
        binding.textViewOptionFour.text = Option_4
        binding.textViewNumberProgress.text = (cursor + 1).toString() + "/" + max.toString()

        //Imageview
        binding.imageViewQuestion.setImageResource(image)

        //Progressbar changes
        binding.mainProgressbar.progress = cursor + 1
        binding.mainProgressbar.max = max
    }

    private fun setWrong() {
        val list = WrongList
        val max = list.size
        val Question = list[cursor].Question
        val image = list[cursor].Image
        val Option_1 = list[cursor].Option_1
        val Option_2 = list[cursor].Option_2
        val Option_3 = list[cursor].Option_3
        val Option_4 = list[cursor].Option_4
        val Correct_option = list[cursor].Correct_option

        //text view changes
        binding.textViewQuestion.text = Question
        binding.textViewOptionOne.text = Option_1
        binding.textViewOptionTwo.text = Option_2
        binding.textViewOptionThree.text = Option_3
        binding.textViewOptionFour.text = Option_4
        binding.textViewNumberProgress.text = (cursor + 1).toString() + "/" + max.toString()

        //Imageview
        binding.imageViewQuestion.setImageResource(image)

        //Progressbar changes
        binding.mainProgressbar.progress = cursor + 1
        binding.mainProgressbar.max = max
    }

    override fun onClick(v: View?) {

        if (v?.id == R.id.text_view_optionOne) {
            var option = 1
            QuestionAns = correct(option)
            //Toast.makeText(context,"Opt 1",Toast.LENGTH_SHORT).show()
        } else if (v?.id == R.id.text_view_optionTwo) {
            var option = 2
            QuestionAns = correct(option)
            //Toast.makeText(context,"Opt 2",Toast.LENGTH_SHORT).show()
        } else if (v?.id == R.id.text_view_optionThree) {
            var option = 3
            QuestionAns = correct(option)
            // Toast.makeText(context,"Opt 3",Toast.LENGTH_SHORT).show()

        } else if (v?.id == R.id.text_view_optionFour) {
            var option = 4
            QuestionAns = correct(option)
            //Toast.makeText(context,"Opt 4",Toast.LENGTH_SHORT).show()

        } else if (v?.id == R.id.btnSubmit) {
            val type = args.QuizType
            if (QuestionAns == true) {
                cursor = cursor + 1
                if (type == 1) {
                    setRoadSign()
                    resetElements()
                } else if (type == 2) {
                    setRoadMark()
                    resetElements()
                } else if (type == 3) {
                    setSignal()
                    resetElements()

                } else if (type == 4) {
                    setRoadRule()
                    resetElements()

                } else if (type == 5) {
                    setVehicleControl()
                    resetElements()

                } else if (type == 6) {
                    setWrong()
                    resetElements()

                }
            } else {
                println("What is happening")
            }

            if (binding.mainProgressbar.max == binding.mainProgressbar.progress) {
                scorepage()

            } else {
                Toast.makeText(context, "btnSubmit " + QuestionAns.toString(), Toast.LENGTH_SHORT)
                    .show()
            }

        } else {
            print("Error")
        }
    }

    fun correct(Option: Int): Boolean {
        val type = args.QuizType
        var helper = WrongDB(requireContext())

        var modelquest = dbmodel()

        //Logic For wrong and correct ans for Road Sign
        if (type == 1) {
            val list = RoadSign[cursor]
            val max = RoadSign.size
            val Correct_option = list.Correct_option
            if (Option == 1) {
                if (binding.textViewOptionOne.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)

                    binding.textViewOptionOne.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 2) {
                if (binding.textViewOptionTwo.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionTwo.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 3) {
                if (binding.textViewOptionThree.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionThree.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            } else if (Option == 4) {
                if (binding.textViewOptionFour.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionFour.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            }
            //Logic For wrong and correct ans for Road Markings
        } else if (type == 2) {
            val list = RoadMark[cursor]
            val max = RoadMark.size
            val Correct_option = list.Correct_option
            if (Option == 1) {

                if (binding.textViewOptionOne.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionOne.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 2) {
                if (binding.textViewOptionTwo.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionTwo.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 3) {
                if (binding.textViewOptionThree.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionThree.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            } else if (Option == 4) {
                if (binding.textViewOptionFour.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionFour.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            }
            //Logic For wrong and correct ans for Signals
        } else if (type == 3) {
            val list = Signal[cursor]
            val max = Signal.size
            val Correct_option = list.Correct_option
            if (Option == 1) {

                if (binding.textViewOptionOne.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionOne.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 2) {
                if (binding.textViewOptionTwo.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionTwo.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 3) {
                if (binding.textViewOptionThree.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionThree.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            } else if (Option == 4) {
                if (binding.textViewOptionFour.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionFour.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            }

            //Logic For wrong and correct ans for Road Rules
        } else if (type == 4) {
            val list = RoadRule[cursor]
            val max = RoadRule.size
            val Correct_option = list.Correct_option
            if (Option == 1) {

                if (binding.textViewOptionOne.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionOne.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 2) {
                if (binding.textViewOptionTwo.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionTwo.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 3) {
                if (binding.textViewOptionThree.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionThree.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 4) {
                if (binding.textViewOptionFour.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionFour.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            }
            //Logic For wrong and correct ans for vehicle Controls
        } else if (type == 5) {
            val list = VehicleControls[cursor]
            val max = VehicleControls.size
            val Correct_option = list.Correct_option

            if (Option == 1) {
                if (binding.textViewOptionOne.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionOne.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 2) {
                if (binding.textViewOptionTwo.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionTwo.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 3) {
                if (binding.textViewOptionThree.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionThree.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 4) {
                if (binding.textViewOptionFour.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    modelquest.Image = list.Image
                    modelquest.Question = list.Question
                    modelquest.Option_1 = list.Option_1
                    modelquest.Option_2 = list.Option_2
                    modelquest.Option_3 = list.Option_3
                    modelquest.Option_4 = list.Option_4
                    modelquest.Correct_option = list.Correct_option
                    modelquest.Times_wrong = list.Times_wrong

                    helper.addWrong_Question(modelquest)
                    binding.textViewOptionFour.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            }
            //Logic For wrong and correct ans for Wrong Questions
        } else if (type == 6) {
            val list = WrongList
            val max = WrongList.size
            val Correct_option = list[cursor].Correct_option
            val question = list[cursor].Question

            if (Option == 1) {
                if (binding.textViewOptionOne.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                    helper.wrong_correct(question)
                } else {
                    Numwrong = Numwrong + 1
                    binding.textViewOptionOne.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 2) {
                if (binding.textViewOptionTwo.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    helper.wrong_correct(question)
                    binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    binding.textViewOptionTwo.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 3) {
                if (binding.textViewOptionThree.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    helper.wrong_correct(question)
                    binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    binding.textViewOptionThree.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionFour.text == Correct_option) {
                        binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }

            } else if (Option == 4) {
                if (binding.textViewOptionFour.text == Correct_option) {
                    NumCorrect = NumCorrect + 1
                    helper.wrong_correct(question)
                    binding.textViewOptionFour.setBackgroundColor(Color.GREEN)
                } else {
                    Numwrong = Numwrong + 1
                    binding.textViewOptionFour.setBackgroundColor(Color.RED)
                    if (binding.textViewOptionOne.text == Correct_option) {
                        binding.textViewOptionOne.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionTwo.text == Correct_option) {
                        binding.textViewOptionTwo.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    } else if (binding.textViewOptionThree.text == Correct_option) {
                        binding.textViewOptionThree.setBackgroundColor(Color.GREEN)
                        QuestionAns = true
                        return QuestionAns
                    }
                }
            }
        }

        QuestionAns = true
        return QuestionAns
    }

    fun resetElements(){
        binding.textViewOptionOne.setBackgroundColor(Color.TRANSPARENT)
        binding.textViewOptionTwo.setBackgroundColor(Color.TRANSPARENT)
        binding.textViewOptionThree.setBackgroundColor(Color.TRANSPARENT)
        binding.textViewOptionFour.setBackgroundColor(Color.TRANSPARENT)

    }
    fun scorepage(){
        binding.btnSubmit.setOnClickListener{view:View ->
            val action = quizfragmentDirections.actionQuizfragmentToScorefragment(NumCorrect,Numwrong,binding.mainProgressbar.max,args.QuizType)
            view.findNavController().navigate(action)
        }
    }
}